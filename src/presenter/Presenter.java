package presenter;

import model.person.Gender;
import model.person.Person;
import model.service.Service;
import view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addPerson(String firstName, String lastName, Gender gender, LocalDate birthDate, LocalDate deathDate){
        service.addPerson(firstName, lastName, gender, birthDate, deathDate);

    }

    public void addParent(int childId, int parentId){
        service.addParent(childId, parentId);
    }

    public void getParents(int childId) {
        view.printAnswer(service.getParents(childId));
    }

    public void getChildren(int parentId) {
        view.printAnswer(service.getChildren(parentId));
    }

    public void getTreeInfo(){
        view.printAnswer(service.getInfo());
    }


    public void sortByName() {
        service.sortByName();
        getTreeInfo();
    }

    public void sortByAge() {
        service.sortByAge();
        getTreeInfo();
    }

    public void saveTree() {
        service.saveTree();
    }

    public void loadTree() {
        service.loadTree();
        getTreeInfo();
    }
}
