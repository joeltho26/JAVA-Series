package Example.HashSet.Contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContactData {
    private static final String phoneData = """
            Charlie Brown, 3334445555
            Franz Stigler, 7698688219
            Strelka Sputnik2, 3979619308
            Strelka Sputnik2, 7698833299
            Belka Sputnik2, 7959715296
            Belka Sputnik2, 7959769981
            Laika Sputnik1, 4891237879
            Laika Sputnik1, 4697697879
            Micky Mouse, 9603880977
            Donald Duck, 9868675859
            """;

    private static final String emailData = """
            Charlie Brown, charliebrown@gmail.com
            Donald Duck, donaldduck@aws.com
            Donald Duck, donladduck@gmail.com
            Franz Stigler, franzstigler@google.com
            Charlie Brown, charliebrown@hotmail.com
            Belka Sputnik2, belka@yahoo.com
            Belka Sputnik2, belka@messenger.com
            Strelka Sputnik2, strelka@facebook.com
            Laika Sputnik1, laika@hotmail.com
            Rajini Thalaivar, rajiniboss@tamilking.com
            """;

    public static List<Contact> getData(String type) {
        List<Contact> dataList = new ArrayList<>();
        Scanner input = new Scanner(type.equals("phone")? phoneData: emailData);
        while(input.hasNext()) {
            String[] data = input.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if (type.equals("phone")) {
                dataList.add(new Contact(data[0],Long.parseLong(data[1])));
            } else if(type.equals("email")) {
                dataList.add(new Contact(data[0],data[1]));
            }
        }
        return dataList;
    }
}
