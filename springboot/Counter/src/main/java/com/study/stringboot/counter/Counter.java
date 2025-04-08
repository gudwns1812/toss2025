package com.study.stringboot.counter;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
@Component
@Getter
@Setter
@NoArgsConstructor
public class Counter {
    private int count;
}
