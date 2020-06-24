

import java.util.*;
import java.lang.*;
import java.io.*;


public class Database
{
	public class Customer
	{
	  int c_id;
	  String name, address, email, phone;
	  
	}
	
	public class Product
	{
	  int p_id;
	  String name, type, barcode;
	  
	}
	public class Order
	{
	  int c_id, p_id, quantity;
	  float price;
	  
	}
	public static void main (String[] args)
	{}
}
