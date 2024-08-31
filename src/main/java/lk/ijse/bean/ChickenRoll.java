/* Created By Sithira Roneth
 * Date :8/31/24
 * Time :10:18
 * Project Name :Spring_AAD
 * */
package lk.ijse.bean;

import lk.ijse.contract.BakeryItems;
import lk.ijse.customAnnotation.CrispyChicken;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Chicken")
@CrispyChicken
public class ChickenRoll implements BakeryItems {
    @Override
    public void eat() {
        System.out.println("I like to eat Chicken roll");
    }
}
