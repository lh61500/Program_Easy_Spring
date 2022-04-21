package IOC;


import org.junit.Test;


public class simpleBeanContainerTest {
    @Test
    public void testGetBean() throws Exception{
        simpleBeanContainer beanFactory=new simpleBeanContainer();
        HelloService helloService1=new HelloService();
        helloService1.getHello("100");
        beanFactory.registerBean("helloService", helloService1);//注册名字为helloService 并且把其中的方法结果放到容器里面
        HelloService helloService=(HelloService) beanFactory.getBean("helloService");//只要调用hello service
        //这样解决了什么问题？ 解决了我定义的东西 可以调用别的方法
        assert helloService.printString()=="100";

    }
    static class HelloService{
        String hello="2";
        public String sayHello(){
          System.out.println("hello2");
          return "hello1";
        }
        public String getHello(String name){
            hello=name;
            return "1";
        }
        public String printString(){
            System.out.println(hello);
            return hello;
        }


    }
}
