package thesis.context.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import thesis.context.controller.Consumer;
import thesis.context.data.PointCloud;

@RestController
public class ControlllerAPI {
    //api to call the consumer class

    Consumer getConsumer;
    public ControlllerAPI (Consumer getConsumer) {
        this.getConsumer=getConsumer;
    }
    @GetMapping ("/original")
    public PointCloud getData() {
       return  getConsumer.consumeLidarData();
    }
}
