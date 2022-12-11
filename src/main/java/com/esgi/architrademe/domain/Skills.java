package com.esgi.architrademe.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Skills {
    Map<String, Integer> skillsMap;

    private Skills() {
        this.skillsMap = new HashMap<>();
    }

    public static Skills create(){
        return new Skills();
    }

    public static Skills of(HashMap<String, Integer> addSkills){
        Skills newSkills = new Skills();
        for (Map.Entry<String, Integer> entry : addSkills.entrySet()) {
            // using put method to copy one Map to Other
            newSkills.skillsMap.put(entry.getKey(),
                    entry.getValue());
        }
        return newSkills;
    }

    public Skills add(String skill, Integer yearOfExperience){
        Skills newSkills = Skills.of((HashMap<String, Integer>) skillsMap);
        newSkills.skillsMap.put(skill, yearOfExperience);
        return newSkills;
    }

    public Skills retrieve(String skill){
        Skills newSkills = Skills.of((HashMap<String, Integer>) skillsMap);
        newSkills.skillsMap.remove(skill);
        return newSkills;
    }

    public boolean contains(String skill){
        return skillsMap.containsKey(skill);
    }

    //TODO getter
}
//public class Skills {
//    ArrayList<String> skills;
//
//    private Skills(ArrayList<String> skills) {
//        this.skills = skills;
//    }
//
//    public static Skills of(ArrayList<String> skills){
//        return new Skills(skills);
//    }
//
//    public Skills add(String skill){
//        ArrayList<String> newSkills = (ArrayList<String>) skills.clone();
//        if(!newSkills.add(skill)){
//            System.out.println("Add skill Exception");//TODO
//        }
//        return new Skills(newSkills);
//    }
//
//    public Skills retrieve(String skill){
//        ArrayList<String> newSkills = (ArrayList<String>) skills.clone();
//        if(!newSkills.remove(skill)){
//            System.out.println("Remove skill Exception");//TODO
//        }
//        return new Skills(newSkills);
//    }
//
//    public Skills contains(String skill){
//        ArrayList<String> newSkills = (ArrayList<String>) skills.clone();
//        if(!newSkills.contains(skill)){
//            System.out.println("Contains skill Exception");//TODO
//        }
//        return new Skills(newSkills);
//    }
//
//    //TODO getter
//}
