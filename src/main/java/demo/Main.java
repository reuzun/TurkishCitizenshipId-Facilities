package demo;

import model.BUILDER_TYPE;
import model.TurkishCitizenshipId;
import model.TurkishCitizenshipIdBuilder;

import java.util.List;

/**
 * @author reuzun
 */
public class Main {

    public static void main(String[] args) throws Exception {
        TurkishCitizenshipId IdFinder = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.FINDER);

        List<String> list = IdFinder.listAvailableIds("22----127--"); // Valid ex : 22734112798

        System.out.println("Possible Id's Using 22-34112-9- : \n------------------");
        int count = 0;
        for (String s : list) System.out.printf("%-2d -> %-11s\n", (count++), s);
        System.out.println("Total count is : " + count);

        System.out.println("\n***************************\n");

        TurkishCitizenshipId RandomIdCreator = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.CREATOR);

        String randomId = RandomIdCreator.create();
        System.out.println("An id that is randomly created : " + randomId);

        System.out.println("\n***************************\n");

        TurkishCitizenshipId IdValidator = new TurkishCitizenshipIdBuilder()
                .build(BUILDER_TYPE.VALIDATOR);

        System.out.println("Is 22734112798 a valid Id for Turkish Citizenship? " + IdValidator.validate("22734112798"));
    }

}
