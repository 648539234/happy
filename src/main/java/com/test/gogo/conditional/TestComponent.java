package com.test.gogo.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @Auther: WuYuXiang
 * @Date: 2020/1/13
 * @Description: com.test.gogo.conditional
 * @version: 1.0
 */
@Component
@Conditional(WindowsConditional.class)
public class TestComponent {
}
