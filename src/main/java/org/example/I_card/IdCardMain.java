package org.example.I_card;

import org.example.I_card.model.entity.IdCard;
import org.example.I_card.repository.IdCardRepository;
import org.example.I_card.repository.Impl.IdCardRepositoryImpl;

import java.util.List;

public class IdCardMain {
    public static void main(String[] args) {
            IdCardRepository idCardRepository =IdCardRepositoryImpl.getInstance();
        List<IdCard>idCards=idCardRepository.getAll();
        System.out.println("------------idcards-=-------------");
        System.out.println(idCards);
        IdCard idCard=idCardRepository.getById(1L);
        System.out.println("------------idcards-=-------------");
        System.out.println(idCards);
       IdCard new1= IdCard.builder().name("Gunel").surname("Quluyeva").
                age(23).finCode("5561586").series("AA")
                .serialNumber("4518562").build();
       boolean insert = idCardRepository.insert(new1);
        System.out.println("------------idcards-=-------------");
        System.out.println(insert);
         boolean update =idCardRepository.update(idCard);
        System.out.println("------------idcards-=-------------");

        boolean delete=idCardRepository.delete(6L);
        System.out.println("------------idcards-=-------------");
        System.out.println(delete);
    }
}
