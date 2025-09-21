package thread.executor.test;

import java.util.concurrent.*;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class OldOrderService {
    public void order(String orderNo) {
        InventoryWork inventoryWork = new InventoryWork(orderNo);
        ShippingWork shippingWork = new ShippingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);
        // 작업 요청
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Boolean> inventoryResult = es.submit(inventoryWork);
        Future<Boolean> shippingResult = es.submit(shippingWork);
        Future<Boolean> accountingResult = es.submit(accountingWork);
        // 결과 확인
        try {
            if (inventoryResult.get() && shippingResult.get() && accountingResult.get()) {
                log("모든 주문 처리가 성공적으로 완료되었습니다.");
            }
        } catch (InterruptedException | ExecutionException e) {
            log("주문처리에 실패했습니다.");
            throw new RuntimeException(e);
        } finally {
            es.close();
        }
    }

    static class InventoryWork implements Callable<Boolean> {
        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShippingWork implements Callable<Boolean> {
        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork implements Callable<Boolean> {
        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}
