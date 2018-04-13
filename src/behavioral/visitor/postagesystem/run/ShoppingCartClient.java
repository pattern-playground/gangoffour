package behavioral.visitor.postagesystem.run;


import behavioral.visitor.postagesystem.Book;
import behavioral.visitor.postagesystem.DVD;
import behavioral.visitor.postagesystem.PostageVisitor;
import behavioral.visitor.postagesystem.Visitable;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartClient {

    private List<Visitable> items;

    public static void main(String[] args) {

        ShoppingCartClient shoppingCartClient = new ShoppingCartClient();
        List<Visitable> itemList = new ArrayList<>();
        itemList.add(new Book());
        itemList.add(new DVD());
        shoppingCartClient.items = itemList;

        // Create a visitor
        PostageVisitor visitor = new PostageVisitor();

        // Iterate through all items
        for(Visitable item: shoppingCartClient.items) {
            item.accept(visitor);
        }

        System.out.println(visitor.getTotalPostage());
    }
}

// *** Output ***
// Call accept method in Book object
// Call visit method for Book in PostageVisitor
// Call accept method in DVD object
// Call visit method for DVD in PostageVisitor
// 0.0