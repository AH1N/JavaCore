package HWJD4;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShopoGolic {
    public String fio;
    public String phoneNumber;
    public Integer age;

    public ShopoGolic(String Fio ){
        this.fio = fio;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    public String getFio() {
        return fio;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String printShopogolic(){
        return String.format("Имя: %s%nНомер телефона: %d%nВозраст: %d%n",
                fio, phoneNumber, age);
    }

    public boolean checkShopogolicFio(String fio) throws CustomerException{
        if(this.fio == fio){
            return true;
        }else {
            throw new CustomerException("Покупатель не найден");
//
        }
    }
}

