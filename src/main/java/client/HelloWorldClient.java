package client;

import com.hello.world.webservice.client.HelloWorldStub;

import java.rmi.RemoteException;

/**
 * Created by chokst on 3/6/15.
 */
public class HelloWorldClient {
    public static void main(String[] args) throws RemoteException {
        HelloWorldStub helloWorldStub = new HelloWorldStub();
        HelloWorldStub.SayHello sayHello = new HelloWorldStub.SayHello();
        sayHello.setName("Tushar");
        HelloWorldStub.SayHelloResponse sayHelloResponse = helloWorldStub.sayHello(sayHello);
        System.out.println(sayHelloResponse.get_return());
    }
}
