package com.aurora.ReflectionDemo.GetClassInfo;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {
    public static void main(String[] args) {

    }

    // 第一组：java.lang.Class  用于获取类的整体结构信息
    @Test
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> PersonCls = Class.forName("com.aurora.ReflectionDemo.GetClassInfo.Person");

        //1.getName()	获取全类名 (包名 + 类名)
        System.out.println(PersonCls.getName());    //com.aurora.ReflectionDemo.GetClassInfo.Person

        //2.getSimpleName()	获取简单类名 (不含包名)
        System.out.println(PersonCls.getSimpleName());  //Person

        //3.getFields()	获取所有 public 修饰的属性，包含本类以及父类的
        Field[] fields = PersonCls.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());    //name bobby
        }

        //4.getDeclaredFields()	获取本类中所有属性 (包括 private, protected, default, public)，不包含父类
        Field[] DeclaredFields = PersonCls.getDeclaredFields();
        for (Field declaredFields : DeclaredFields) {
            System.out.println(declaredFields.getName());   //name age job salary
        }

        //5.getMethods()	获取所有 public 修饰的方法，包含本类以及父类的
        Method[] methods = PersonCls.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        //6.getDeclaredMethods()	获取本类中所有方法，不包含父类
        Method[] DeclaredMethods = PersonCls.getDeclaredMethods();
        for (Method method : DeclaredMethods) {
            System.out.println(method.getName());   //m1 m2 m3
        }

        //7.getConstructors()	获取本类所有 public 修饰的构造器
        Constructor<?>[] constructors = PersonCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        //8.getDeclaredConstructors()	获取本类中所有构造器
        Constructor<?>[] declaredConstructors = PersonCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }

        //9.getPackage()	以 Package 形式返回包信息
        System.out.println(PersonCls.getPackage());     //package com.aurora.ReflectionDemo.GetClassInfo

        //10.getSuperclass()	以 Class 形式返回父类信息
        Class<?> superClass = PersonCls.getSuperclass();
        System.out.println(superClass.getName());   //com.aurora.ReflectionDemo.GetClassInfo.A

        //11.getInterfaces()	以 Class[] 形式返回接口信息
        Class<?>[] interfaces = PersonCls.getInterfaces();
        for (Class<?> interfaceClass : interfaces) {
            System.out.println(interfaceClass.getName());   //com.aurora.ReflectionDemo.GetClassInfo.IA com.aurora.ReflectionDemo.GetClassInfo.IB
        }

        //12.getAnnotations()	以 Annotation[] 形式返回注解信息
        Annotation[] annotations = PersonCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);     //@java.lang.Deprecated()
        }
    }

    //第二组：Java.lang.reflect.Field  用于获取成员变量（属性）的详细信息
    @Test
    public void api_02() throws ClassNotFoundException {
        //得到Class对象
        Class<?> PersonCls = Class.forName("com.aurora.ReflectionDemo.GetClassInfo.Person");
        Field[] declaredFields = PersonCls.getDeclaredFields();
        //1.getName()	返回属性名
        //2.getModifiers()	以 int 形式返回修饰符 (参见下方修饰符对照表)
        //3.getType()	以 Class 形式返回属性类型
        for (Field field : declaredFields) {
            System.out.println("属性名=" +field.getName()
                                + ", 该属性修饰符=" + field.getModifiers()
                                + ", 该属性的类型=" + field.getType());    //name age job salary
        }
        /**
         * 属性名=name, 该属性修饰符=1, 该属性的类型=class java.lang.String
         * 属性名=age, 该属性修饰符=12, 该属性的类型=int
         * 属性名=job, 该属性修饰符=0, 该属性的类型=class java.lang.String
         * 属性名=salary, 该属性修饰符=2, 该属性的类型=double
         */
    }

    //第三组：java.lang.reflect.Method 类    用于获取方法的详细信息
    @Test
    public void api_03() throws ClassNotFoundException {
        Class<?> PersonCls = Class.forName("com.aurora.ReflectionDemo.GetClassInfo.Person");
        Method[] declaredMethods = PersonCls.getDeclaredMethods();

        //1.getName()	返回方法名
        //2.getModifiers()	以 int 形式返回修饰符
        //3.getReturnType()	以 Class 形式获取返回类型
        for (Method method : declaredMethods) {
            System.out.println("方法名=" +method.getName()
                                + ", 该方法的访问修饰符值=" + method.getModifiers()
                                + ", 该方法的返回值类型=" + method.getReturnType());
        }
        /**
         * 方法名=m3, 该方法的访问修饰符值=2, 该方法的返回值类型=void
         * 方法名=m2, 该方法的访问修饰符值=4, 该方法的返回值类型=class java.lang.String
         * 方法名=m1, 该方法的访问修饰符值=1, 该方法的返回值类型=void
         */

        //getParameterTypes()	以 Class[] 返回参数类型数组
        Class<?>[] parameterTypes = declaredMethods[2].getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        /**
         * class java.lang.String
         * int
         * double
         */
    }

    //4.java.lang.reflect.Constructor 类  用于获取构造器的详细信息
    @Test
    public void api_04() throws ClassNotFoundException {
        Class<?> PersonCls = Class.forName("com.aurora.ReflectionDemo.GetClassInfo.Person");
        Constructor<?>[] declaredConstructors = PersonCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("构造器名=" + declaredConstructor.getName()
                                + ", 该构造器的修饰符值=" + declaredConstructor.getModifiers());
        }
        /**
         * 构造器名=com.aurora.ReflectionDemo.GetClassInfo.Person, 该构造器的修饰符值=1
         * 构造器名=com.aurora.ReflectionDemo.GetClassInfo.Person, 该构造器的修饰符值=1
         * 构造器名=com.aurora.ReflectionDemo.GetClassInfo.Person, 该构造器的修饰符值=1
         */

        Class<?>[] parameterTypes = declaredConstructors[0].getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameterType);
        }
        /**
         * class java.lang.String
         * int
         */
    }
}
