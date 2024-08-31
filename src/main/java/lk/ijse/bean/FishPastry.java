/* Created By Sithira Roneth
 * Date :8/31/24
 * Time :10:18
 * Project Name :Spring_AAD
 * */
package lk.ijse.bean;

import lk.ijse.contract.BakeryItems;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FishPastry implements BakeryItems {
    @Override
    public void eat() {
        System.out.println("I like to eat Fish Pastry");
    }
}
