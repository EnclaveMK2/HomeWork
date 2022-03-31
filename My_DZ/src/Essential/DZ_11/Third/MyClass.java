package Essential.DZ_11.Third;

import java.lang.reflect.InvocationTargetException;

public class MyClass<T> {
    public static <T> T factoryMethod(Class<T> someClass, Class<?>... params) throws
            NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return  someClass.getConstructor(params).newInstance();
    }

}

class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        MyClass some = MyClass.factoryMethod(MyClass.class);
        System.out.println(some);
    }
}

