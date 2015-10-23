package test;

import entity.Group;
import facade.GroupFacade;
import java.util.List;
import java.util.concurrent.Future;

/**
 *
 * @author Lukasz Krawczyk
 */

public class Tester {

    public static void main(String[] args) throws Exception{
        List<Group> list = new GroupFacade().getGroups();
        
        for (Group group : list) {
            System.out.println("Personer: " +group.getGroupAuthors() + " - Klasse: " + group.getGroupClass() + " - Grouppenummer: " + group.getGroupNumber());
        }
    }
}
