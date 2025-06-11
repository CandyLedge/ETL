package core.intf;

import java.util.function.Consumer;

public interface IChannel<T>{
    void publish(T row) throws InterruptedException;
    void subscribe(Consumer<T> consumer);
    void close();
    boolean isClosed();
}
