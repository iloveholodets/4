package somepackage;

import org.junit.jupiter.api.Test;


public class InjectorTest {
    @Test
    public void testInjectorInjectsDependencies() {
        SomeBean sb = new Injector().inject(new SomeBean());

        System.out.println("Field1 should be not empty, is: " + sb.field1);
        System.out.println("Field2 should be not empty, is: " + sb.field2);
    }

    @Test
    public void testSomeBeanFunctionality() {
        SomeBean sb = new Injector().inject(new SomeBean());
        sb.foo(); // Ожидаемый вывод: A C
    }

    @Test
    public void testInjectorWhenNoImplementstion() {
        SomeBean sb = new SomeBean();//.inject(new SomeBean());

        System.out.println("Field1 should be empty, is: " + sb.field1);
        System.out.println("Field2 should be empty, is: " + sb.field2);
    }

}
