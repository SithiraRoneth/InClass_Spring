/* Created By Sithira Roneth
 * Date :8/31/24
 * Time :10:19
 * Project Name :Spring_AAD
 * */
package lk.ijse.bean;

import lk.ijse.contract.BakeryItems;
import org.springframework.stereotype.Component;

@Component
public class FishBun implements BakeryItems {
    @Override
    public void eat() {
        System.out.println("I like to eat Fish Bun");
    }
}
