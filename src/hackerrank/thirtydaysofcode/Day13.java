package hackerrank.thirtydaysofcode;

import hackerrank.thirtydaysofcode.Mock.Book;

/**
 * Created by kazanture on 4/24/2017.
 * https://www.hackerrank.com/challenges/30-abstract-classes
 */
public class Day13 extends Book
{
    private int price;
    Day13(String title,String author,int price){
        super(title,author);
        this.price=price;
    }
    public void display(){
        System.out.println("Title: "+this.title);
        System.out.println("Author: "+this.author);
        System.out.println("Price: "+this.price);
    }
}