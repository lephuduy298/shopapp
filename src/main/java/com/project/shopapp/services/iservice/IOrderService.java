package com.project.shopapp.services.iservice;

import com.project.shopapp.dto.OrderDTO;
import com.project.shopapp.dto.res.ResOrder;
import com.project.shopapp.error.IndvalidRuntimeException;
import com.project.shopapp.error.PostException;
import com.project.shopapp.models.Order;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws IndvalidRuntimeException;

    Order updateOrder(long id, OrderDTO orderDTO) throws IndvalidRuntimeException, PostException;

    Order getOrderById(long id) throws PostException;

    Page<ResOrder> getAllOrders(PageRequest pageRequest);

    void deleteOrderById(long id) throws PostException;

    List<Order> getOrderByUserId(@Valid Long userId);
}
