package Reto2_Web.repositorio;
import Reto2_Web.modelo.Order;
import Reto2_Web.interfaces.InterfaceOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepositorio {

    @Autowired
    private InterfaceOrder interfaceOrder;

    public List<Order> getAll() {
        return (List<Order>) interfaceOrder.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return interfaceOrder.findById(id);
    }

    public Order create(Order order) {
        return interfaceOrder.save(order);
    }

    public void update(Order order) {
        interfaceOrder.save(order);
    }

    public void delete(Order order) {interfaceOrder.delete(order);
    }

    public Optional<Order> lastUserId(){
        return interfaceOrder.findTopByOrderByIdDesc();
    }
}
