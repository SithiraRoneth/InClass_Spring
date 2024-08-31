/* Created By Sithira Roneth
 * Date :8/31/24
 * Time :10:17
 * Project Name :Spring_AAD
 * */
package lk.ijse.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.contract.BakeryItems;
import lk.ijse.customAnnotation.CrispyChicken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {
    private BakeryItems bakeryItems;

    public Mahesh(){
        System.out.println(bakeryItems);
    }

    @Autowired
    @Qualifier("Chicken")
    @CrispyChicken
    public void setBakeryItems(BakeryItems bakeryItems){
        this.bakeryItems = bakeryItems;
    }

    @PostConstruct
    public void init(){
        bakeryItems.eat();
    }

}
