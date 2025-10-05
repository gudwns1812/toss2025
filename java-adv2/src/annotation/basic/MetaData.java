package annotation.basic;

@AnnoMeta // 타입에 적용
public class MetaData {

    //@AnnoMeta 필드에 적용 - 컴파일 오류
    private String id;

    @AnnoMeta
    public void call() {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<MetaData> typeAnno = MetaData.class;
        System.out.println("typeAnno = " + typeAnno);

        AnnoMeta methodAnno = MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
        System.out.println("methodAnno = " + methodAnno);
    }
}
