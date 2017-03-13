package test;

import java.util.ArrayList;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;


public class SortTest { 
  public static void main(String[] args) { 
    ArrayList<String> stateList = new ArrayList<String>();
    stateList.add("TX");
    stateList.add("WA");
    stateList.add("CA");
    for(int i=0;i<stateList.size();i++){ 
      System.out.println(stateList.get(i)); 
    } 
    Collections.sort(stateList);
    System.out.println("--- Sorted ---");
    for(int i=0;i<stateList.size();i++){ 
      System.out.println(stateList.get(i)); 
    } 
  }
}