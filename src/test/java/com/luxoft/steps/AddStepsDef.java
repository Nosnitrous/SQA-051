package com.luxoft.steps;

import com.luxoft.Calc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.it.Ma;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

public class AddStepsDef {
    Calc calc = new Calc();

    @Given("numbers are")
    public void numbersAre(List<String> data) {
        for (String value : data) {
            System.out.println(value);
        }
    }


    @Given("x divides y")
    public void xDividesY(List<List<Integer>> data) {
        for (int i = 0; i < data.size(); i++) {
            Assertions.assertTrue(calc.isXdividesY(data.get(i).get(0), data.get(i).get(1)));
            System.out.println("line " + i + " : " + data.get(i).get(0) + " ; " + data.get(i).get(1));
        }
    }

//    @Given("x divides y Map")
//    public void xDividesYMap(Map<String, String> data) {
//        data.forEach((K, V) ->
//                Assertions.assertTrue(calc.isXdividesY(Integer.parseInt(K), Integer.parseInt(V))));
//      }

//    @Given("x divides y Map2")
//    public void xDividesYMap2(Map<String, String> data) {
//        for (Map.Entry(String, String) entry:data.entrySet()){
//            Assertions.assertTrue(calc.isXdividesY(entry.getKey(), entry.getValue());
//        }
//    }

    @Given("x divides y DataTable")
    public void xDividesYDataTable(DataTable dt) {
        for (int i=1;i<dt.height();i++) {
            Assertions.assertTrue(calc.isXdividesY(Integer.parseInt(dt.row(i).get(0)),
                    Integer.parseInt(dt.row(i).get(1))));
            System.out.println("line " + i + " : " + dt.row(i).get(0) + " ; " + dt.row(i).get(1));
        }
    }
}