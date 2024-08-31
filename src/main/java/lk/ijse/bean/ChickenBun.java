/* Created By Sithira Roneth
 * Date :8/31/24
 * Time :10:19
 * Project Name :Spring_AAD
 * */
package lk.ijse.bean;

import lk.ijse.contract.BakeryItems;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Chicken")
public class ChickenBun implements BakeryItems {
    @Override
    public void eat() {
        System.out.println("I like to eat Chicken Bun");
    }
}
