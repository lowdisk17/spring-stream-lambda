package com.streamlambda.streamlambda.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class MainService {

  public void process () {

    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);

    // Sample of forEach 
    list1.stream().forEach(System.out::print);

    newLine(); // newline

    // Sample of map
    list1.stream().map(x -> x * 2).collect(Collectors.toList()).forEach(System.out::print);

    newLine(); // newline

    // Sample of filter
    list1.stream().filter(i -> i == 1).collect(Collectors.toList()).forEach(System.out::print);

    newLine(); // newline

    // Sample of limits
    list1.stream().limit(1).collect(Collectors.toList()).forEach(System.out::print);

    newLine(); // newline

    List<Integer> list2 = new ArrayList<>();
    list2.add(2);
    list2.add(1);
    list2.add(3);

    // Sample of sorted
    list2.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);

    newLine(); // newline

    // Sample of reduce
    System.out.println(list2.stream().reduce(Integer::sum).get());

  }

  private void newLine () {
    System.out.println();
  }
  
}
