public class FindLocators {

    //1. Your Cart
    //logo //div[contains(@class, 'logo')]
    //span[contains(@class,'badge')] > logo goc phai
    //title //span[@class='title']
    //div[text() = 'QTY']
    //div[contains(text(),'Description')]
    //logo 1 //div[@class='cart_quantity' and text() ='1']
    //div[contains(text(),'Backpack')]
    //div[contains(text(),'carry')] > description 1
    //div[contains(@class,'price') and contains(., '29.99')] > gia san pham 1
    //div[contains(text(),'Backpack')]/ancestor::div[contains(@class,'cart_item')]//button > button remove 1 by ancestor
    //div//button[contains(@id,'backpack')] > button remove 1 by id
    //div[contains(@class,'footer')]//ancestor::button[contains(text(),'Continue')] button continue at footer
    //div[contains(@class,'footer')]//ancestor::button[contains(text(),'Checkout')]


    //2. Checkout Your information
    //span[@class='title']
    //input[contains(@placeholder,'First Name')]
    //input[contains(@placeholder,'Last Name')]
    //input[contains(@placeholder,'Zip')]
    //button[text()='Cancel']
    //input[@value='Continue']

    //3. Checkout Overview
    //span[contains(@class,'title')]
    //div[contains(@class,'quantity_label')]
    //div[contains(@class,'desc_label')]
    //div[contains(text(),'T-Shirt')]//ancestor::div[@class='cart_item']//div[@data-test='item-quantity']
    //div[contains(text(),'Bike Light')]
    //div[contains(@class,'summary_info') and contains(text(),'Payment Infor')]
    //div[contains(text(),'Shipping Infor')]
    //div[contains(text(),'Price T')]
    //div[contains(text(),'Item t')]
    //div[@class='summary_tax_label']
    //div[@class='summary_total_label']
    //button[@id='cancel']
    //button[@id='finish']

    //4. Checkout Complete!
    //span[@class='title']
    //img[@alt='Pony Express']
    //h2[contains(text(),'Thank')]
    //h2[contains(@class,'complete')]
    //button[contains(@name,'back')]
    //a[contains(@data-test,'twitter')]
    //a[contains(@data-test,'face')]
    //a[contains(@data-test,'linkedin')]
    //div[contains(@class,'footer_copy')]

}
