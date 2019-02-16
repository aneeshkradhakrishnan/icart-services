package com.icart.components;

import com.icart.models.Item;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/cart")
public class CartController {

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public ResponseEntity<List<Item>> listAllItems() {
        List<Item> list = new ArrayList<>(2);
        list.add(new Item("Rice", 12d));
        list.add(new Item("Sugar", 10d));
        return new ResponseEntity<List<Item>>(list, HttpStatus.OK);
    }
}
