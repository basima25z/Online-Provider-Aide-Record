import java.util.*;
 import java.io.*;
 import java.text.*;
  
public class infoMethods
{
  private String name = " "; // creates all the state variables as private because they are accessed and changed within the same class
  
  private String day = " "; // d
  private String date = " "; // dt
  private String activity= " ";
  private String observation = " ";
  private String observation2 = " ";
  private String empty = " ";
  private int count = 0;
  
  private String monHours = " ";
  private String tuesHours = " ";
  private String wedHours = " ";
  private String thursHours = " ";
  private String friHours = " ";
  private String satHours = " ";
  private String sunHours = " ";

  
  infoMethods [] infoArray;
  
 public infoMethods ()
 {
   infoArray = new infoMethods [1000]; // 1000 elements to accommodate the potential large number of information being inputted by the user
   count = 0; // to traverse through the array 
 }
 public infoMethods(String n, String d, String dt, String a, String o,String oTwo, String e, String mH, String tuH, String wH, String tH, String fH, String sH, String snH) // constructor 
 {
   name = n; // Set variable to match the parameters
   day = d;
   date = dt;
   activity =a;
   observation = o;
   observation2 = oTwo;
   empty = e;
   
   monHours = mH;
   tuesHours = tuH;
   wedHours = wH;
   thursHours = tH;
   friHours = fH;
   satHours = sH;
   sunHours = snH;
   
 }
 
  public String fetchName()
  {
    return name;
  }
  public String fetchDay()
  {
    return day;
  }
  public String fetchDate()
  {
    return date;
  }

  public String fetchObservation2()
  {
    return observation2;
 
  }
  public String fetchActivity()
  {
    return activity;
  }
  private String fetchObservation()
  {
    return observation;
  }
  private String fetchEmpty()
  {
    return empty;
  }
  private String fetchMonHours()
  {
    return monHours;
  }
  private String fetchTuesHours()
  {
    return tuesHours;
  }
  private String fetchWedHours()
  {
    return wedHours;
  }
  private String fetchThursHours()
  {
    return thursHours;
  }
  private String fetchFriHours()
  {
    return friHours;
  }
  private String fetchSatHours()
  {
    return satHours;
  }
  private String fetchSunHours()
  {
    return sunHours;
  }

  public void assignName (String n)
  {
    name = n;
  }
  public void assignDay(String d)
  {
    day = d;
  }
  public void assignDate(String dt)
  {
    date = dt;
  }

  public void assignActivity (String a)
  {
    activity =a;
  }
  public void assignObservation (String o)
  {
    observation = o;
  }
  
  public void assignObservation2 (String oTwo)
  {
    observation2 = oTwo;
  }
  public void assignEmpty(String e)
  {
    empty = e;
  }
  public void assignMonHours(String mH)
  {
    monHours = mH;
  }
  public void assignTuesHours(String tuH)
  {
    tuesHours = tuH;
  }
  public void assignWedHours (String wH)
  {
    wedHours = wH;
  }
  public void assignThursHours (String tH)
  {
    thursHours = tH;
  }
  public void assignFriHours (String fH)
  {
    friHours = fH;
  }
  public void assignSatHours (String sH)
  {
    satHours = sH;
  }
  public void assignSunHours(String snH)
  {
    sunHours = snH;
  }
  
  public void fileReader(File file) throws IOException
  {
    try
    {
      
      BufferedReader br = new BufferedReader (new FileReader ("info.txt"));
      name = " "; 
      day = " ";
      date = " ";
      activity = " ";
      observation = " ";
      observation2 = " ";
      empty = " ";
      monHours = " ";
      tuesHours = " ";
      wedHours = " ";
      thursHours = " ";
      friHours = " ";
      satHours = " ";
      sunHours = " ";
      
      while(br.ready())
      {
        name = br.readLine();
        day= br.readLine();
        date= br.readLine();
        
        activity= br.readLine();
        observation = br.readLine();
        
        String x = br.readLine();
        
        observation2 = br.readLine();
        empty = br.readLine();
        
        monHours = br.readLine();
        tuesHours = br.readLine();
        wedHours = br.readLine();
        thursHours = br.readLine();
        friHours = br.readLine();
        satHours = br.readLine();
        sunHours = br.readLine();
        
        infoMethods temp = new infoMethods (name,day,date,activity,observation,observation2, empty, monHours, tuesHours, wedHours, thursHours, friHours, satHours, sunHours);
          
        infoArray [count] = temp;
        count+=1; ////File file = new File ("info.txt");
      }
    br.close();
    }
    catch(IOException ex)
    {
      ex.printStackTrace();
    }
  }
  
  public void fileWriter () throws IOException
  {
    try 
    {
      FileWriter fw = new FileWriter("info.txt");
      PrintWriter output = new PrintWriter (fw);
      
      for (int a=0;a<count;a++)
      {
        output.println(infoArray[a].fetchName());
        output.println(infoArray[a].fetchDay());
        output.println(infoArray[a].fetchDate());
        output.println(infoArray[a].fetchActivity());
        output.println(infoArray[a].fetchObservation());
        output.println(infoArray[a].fetchObservation2());
        output.println(infoArray[a].fetchEmpty());
        
        output.println(infoArray[a].fetchMonHours());
        output.println(infoArray[a].fetchTuesHours());
        output.println(infoArray[a].fetchWedHours());
        output.println(infoArray[a].fetchThursHours());
        output.println(infoArray[a].fetchFriHours());
        output.println(infoArray[a].fetchSatHours());
        output.println(infoArray[a].fetchSunHours());
      }
     output.close();
     }
    catch (IOException ex)
    {
      
      System.out.println ("Error reading your file, please try again");
      
    }
  }
  
  public void addInfo()
  {
    Scanner kbReader = new Scanner (System.in);
    name = " ";
    day = " "; // d
    date = " "; // dt
    activity = " ";
    observation = " ";
    observation2 = " ";
    empty = " ";
    
    monHours = " ";
    tuesHours = " ";
    wedHours = " ";
    thursHours = " ";
    friHours = " ";
    satHours = " ";
    sunHours = " ";
    
    System.out.println ("Whose file would you like to add to?");
    System.out.println ("1. Kenze");
    System.out.println ("2. Zac");
    System.out.println ("3. Julie");
    System.out.println ("Please enter an integer for which day you would like to add information for");
    
    if (!kbReader.hasNextInt())
    {
      System.out.println ("Please enter an integer ranging from 1-3");
      addInfo();
    }
    
    int clientSelection = kbReader.nextInt();
    
    switch (clientSelection)
    { // close this
      case 1:
      { // close this
        String client = "Kenze";
        name = ("Client name: " + client);
        System.out.println ("Please enter an integer for which day you would like to add information for");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
    
    
        if (!kbReader.hasNextInt())
        {
          System.out.println ("Please enter an integer ranging from 1-7");
          addInfo();
        }
        int daySelection = kbReader.nextInt();
  
    
        switch (daySelection)
        {
          case 1:
          {
            
            
            day = "Day: Monday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedMonday = kbReader.nextInt();
            monHours = "Monday Hours: " + totalHoursWorkedMonday;
            
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
              
              
            }
            
            
        
        
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
        
   
        
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
     
         
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes") || physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!"); 
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Activity stored!");
                  }
                }
                
                
                
                
                
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2 = new Scanner(System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  
                  System.out.println ("Information is stored");
                  break;
                  
                }
                
                
                
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  
                  break;
                }
                
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                
                
                break;
              }
              
              
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                }
                
                else if(physical.equalsIgnoreCase ("yes"))
                { 
                  
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 6:
              {
                activity = "Activity: Work/School/Social";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                
                
                System.out.println ("Please try again, you entered a number a number out of range");
                
                
                break;
              }
              
              
            } // for activity switch
            break;
          }// outside case 1
          
          
          
          case 2:
          {
            day = "Day: Tuesday";
            
             System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedTuesday = kbReader.nextInt();
            tuesHours = "Tuesday Hours: " + totalHoursWorkedTuesday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            
            
            
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/School/Social";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                
                break;
              }
              
            } // for activity switch
            break;
          }
          
          
          case 3:
          {
            day = "Day: Wednesday";
            
             System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedWednesday = kbReader.nextInt();
            wedHours = "Wednesday Hours: " + totalHoursWorkedWednesday;
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 4:
          {
            day = "Day: Thursday";
             System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedThursday = kbReader.nextInt();
            thursHours = "Thursday Hours: " + totalHoursWorkedThursday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the physical condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 5:
          {
            day = "Day: Friday";
             System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedFriday= kbReader.nextInt();
            friHours = "Friday Hours: " + totalHoursWorkedFriday;
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 6:
          {
            day = "Day: Saturday";
             System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedSaturday = kbReader.nextInt();
            satHours = "Saturday Hours: " + totalHoursWorkedSaturday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          case 7:
          {
            day = "Day: Sunday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedSunday = kbReader.nextInt();
            sunHours = "Sunday Hours: " + totalHoursWorkedSunday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                
                
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                
                break;
              }
              
            } // for activity switch
          } // for case 7
          break;
          default:
          {
            System.out.println ("Please enter a number between 0-7");
            //addInfo();
            //break;
          }
          break;
          
        } 
        break; // for day selection
      }
      
      case 2:
        { // close this
        String client = "Zac";
        name = ("Client name: " + client);
        System.out.println ("Please enter an integer for which day you would like to add information for");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
    
    
        if (!kbReader.hasNextInt())
        {
          System.out.println ("Please enter an integer ranging from 1-7");
          addInfo();
        }
        int daySelection = kbReader.nextInt();
  
    
        switch (daySelection)
        {
          case 1:
          {
            
            day = "Day: Monday";
            
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedMonday = kbReader.nextInt();
            monHours = "Monday Hours: " + totalHoursWorkedMonday;
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
              
              
            }
            
            
        
        
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
        
   
        
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
     
         
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes") || physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!"); 
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Activity stored!");
                  }
                }
                
                
                
                
                
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2 = new Scanner(System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  
                  System.out.println ("Information is stored");
                  break;
                  
                }
                
                
                
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  
                  break;
                }
                
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                
                
                break;
              }
              
              
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                }
                
                else if(physical.equalsIgnoreCase ("yes"))
                { 
                  
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 6:
              {
                activity = "Activity: Work/School/Social";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                
                
                System.out.println ("Please try again, you entered a number a number out of range");
                
                
                break;
              }
              
              
            } // for activity switch
            break;
          }// outside case 1
          
          
          
          case 2:
          {
            day = "Day: Tuesday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedTuesday = kbReader.nextInt();
            tuesHours = "Tuesday Hours: " + totalHoursWorkedTuesday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            
            
            
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/School/Social";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                
                break;
              }
              
            } // for activity switch
            break;
          }
          
          
          case 3:
          {
            day = "Day: Wednesday";
            
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedWednesday = kbReader.nextInt();
            wedHours = "Wednesday Hours: " + totalHoursWorkedWednesday;
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 4:
          {
            day = "Day: Thursday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedThursday = kbReader.nextInt();
            thursHours = "Thursday Hours: " + totalHoursWorkedThursday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the physical condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 5:
          {
            day = "Day: Friday";
            
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedFriday = kbReader.nextInt();
            friHours = "Friday Hours: " + totalHoursWorkedFriday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 6:
          {
            day = "Day: Saturday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedSaturday= kbReader.nextInt();
            satHours = "Saturday Hours: " + totalHoursWorkedSaturday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          case 7:
          {
            day = "Day: Sunday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedSunday = kbReader.nextInt();
            sunHours = "Sunday Hours: " + totalHoursWorkedSunday;
           
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                
                
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                
                break;
              }
              
            } // for activity switch
          } // for case 7
          break;
          default:
          {
            System.out.println ("Please enter a number between 0-7");
            //addInfo();
            //break;
          }
          break;
          
        }
        break; // for day selection
      }
        
      case 3:
         { // close this
        String client = "Julie";
        name = ("Client name: " + client);
        System.out.println ("Please enter an integer for which day you would like to add information for");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
    
    
        if (!kbReader.hasNextInt())
        {
          System.out.println ("Please enter an integer ranging from 1-7");
          addInfo();
        }
        int daySelection = kbReader.nextInt();
  
    
        switch (daySelection)
        {
          case 1:
          {
            
            day = "Day: Monday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedMonday = kbReader.nextInt();
            monHours = "Monday Hours: " + totalHoursWorkedMonday;
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
              
              
            }
            
            
        
        
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
        
   
        
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
     
         
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes") || physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!"); 
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Activity stored!");
                  }
                }
                
                
                
                
                
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2 = new Scanner(System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  
                  System.out.println ("Information is stored");
                  break;
                  
                }
                
                
                
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  
                  break;
                }
                
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                
                
                break;
              }
              
              
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                }
                
                else if(physical.equalsIgnoreCase ("yes"))
                { 
                  
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                  
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 6:
              {
                activity = "Activity: Work/School/Social";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                
                
                System.out.println ("Please try again, you entered a number a number out of range");
                
                
                break;
              }
              
              
            } // for activity switch
            break;
          }// outside case 1
          
          
          
          case 2:
          {
            day = "Day: Tuesday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedTuesday = kbReader.nextInt();
            tuesHours = "Tuesday Hours: " + totalHoursWorkedTuesday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            
            
            
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/School/Social";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                
                break;
              }
              
            } // for activity switch
            break;
          }
          
          
          case 3:
          {
            day = "Day: Wednesday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedWednesday= kbReader.nextInt();
            wedHours = "Wednesday Hours: " + totalHoursWorkedWednesday;
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 4:
          {
            day = "Day: Thursday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedThursday= kbReader.nextInt();
            thursHours = "Thursday Hours: " + totalHoursWorkedThursday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            
            
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the physical condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 5:
          {
            day = "Day: Friday";
            
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedFriday = kbReader.nextInt();
            friHours = "Friday Hours: " + totalHoursWorkedFriday;
            
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          
          case 6:
          {
            day = "Day: Saturday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedSaturday = kbReader.nextInt();
            satHours = "Saturday Hours: " + totalHoursWorkedSaturday;
            
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                break;
              }
              
            } // for activity switch
            break;
          }
          case 7:
          {
            day = "Day: Sunday";
            System.out.println ("How many hours did you work?");
            
            if (!kbReader.hasNextInt())
            {
              System.out.println ("Please enter in integer form");
              addInfo();
              
            }
            int totalHoursWorkedSunday = kbReader.nextInt();
            sunHours = "Sunday Hours: " + totalHoursWorkedSunday;
           
            try 
            {  
              System.out.println ("Please enter the date in integer form");
              System.out.println ("What month is it?");
              int month = kbReader.nextInt();
              System.out.println ("What day is it?");
              int day = kbReader.nextInt();
              System.out.println ("What year is it?");
              int year = kbReader.nextInt();
              date = ("Date: " + month + "/" + day + "/" + year);
              
            }
            
            catch (InputMismatchException ex)
            {
              Scanner kb = new Scanner (System.in);
              System.out.println ("Please enter in integer form");
              System.out.println ("What month is it?");
              int mRedo = kb.nextInt();
              System.out.println ("What day is it?");
              int dRedo = kb.nextInt();
              System.out.println ("What year is it?");
              int yRedo = kb.nextInt();
              date = ("Date: " +  mRedo + "/" + dRedo + "/" + yRedo);
            }
            
            System.out.println ("Which activity was it? Please enter in integer form");
            System.out.println ("1. Bath");
            System.out.println ("2. Dress/Undress");
            System.out.println ("3. Personal Grooming");
            System.out.println ("4. Assist with self-admin medication");
            System.out.println ("5. Clean kitchen");
            System.out.println ("6. Work/School/Social");
            
            
            while(!kbReader.hasNextInt())
            {
              String trash = kbReader.next();
              System.out.println ("Please enter an integer");
            }
            int as = kbReader.nextInt();
            
            switch (as)
            {
              case 1:
              {
                activity = "Activity: Bath";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 2:
              {
                activity = "Activity: Dress/Undress";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              
              case 3:
              {
                activity = "Activity: Personal Grooming";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 4:
              {
                activity = "Activity: Assists with self-admin medication";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
                
              }
              case 5:
              {
                activity = "Activity: Clean kitchen";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                break;
              }
              case 6:
              {
                activity = "Activity: Work/Social/School";
                System.out.println ("Did you observe any change in the individual's condition? Please enter yes or no.");
                String physical = kbReader.next();
                
                if (!(physical.equalsIgnoreCase("yes")||physical.equalsIgnoreCase("no")))
                {
                  System.out.println ("Please enter yes or no!");
                  String redo = kbReader.next();
                  if (redo.equalsIgnoreCase ("yes"))
                  {
                    Scanner kbReader2= new Scanner (System.in);
                    System.out.println ("What change did you observe in the individual's physical condition?");
                    String observationP = kbReader2.nextLine();
                    observation = ("Physical observation: " + observationP);
                    System.out.println ("Information is stored");
                    System.out.println ("What change did you observe in the individual's emotional condition?");
                    String observationE = kbReader2.nextLine();
                    observation2 = ("Emotional observation: " + observationE);
                    System.out.println ("Information is stored");
                    break;
                    
                  }
                  else if (redo.equalsIgnoreCase ("no"))
                  {
                    System.out.println ("Information is stored!");
                  }
                  
                } 
                else if(physical.equalsIgnoreCase ("yes"))
                {
                  Scanner kbReader2= new Scanner (System.in);
                  System.out.println ("What change did you observe in the individual's physical condition?");
                  String observationP = kbReader2.nextLine();
                  observation = ("Physical observation: " + observationP);
                  System.out.println ("Information is stored");
                  System.out.println ("What change did you observe in the individual's emotional condition?");
                  String observationE = kbReader2.nextLine();
                  observation2 = ("Emotional observation: " + observationE);
                  System.out.println ("Information is stored");
                  break;
                }
                else if(physical.equalsIgnoreCase ("no"))
                {
                  System.out.println ("Activity Stored!");
                  break;
                }
                
                else
                {
                  System.out.println ("Please enter yes or no");
                  addInfo();
                }
                
                
                break;
              }
              default:
              {
                System.out.println ("Please try again, you entered a number a number out of range");
                
                break;
              }
              
            } // for activity switch
          } // for case 7
          break;
          default:
          {
            System.out.println ("Please enter a number between 0-7");
            //addInfo();
            //break;
          }
          break;
          
        } 
        break;// for day selection
      }
      
    }
    
    
  
  //************************************************************************************
  
  
  infoMethods temp = new infoMethods (name,day,date, activity, observation, observation2, empty, monHours, tuesHours, wedHours, thursHours, friHours, satHours, sunHours); // writes to file
    
  
  infoArray[count] = temp;
  count++;
  
  try 
  {
    fileWriter(); // where I actually write to the file
  }
  
  catch(IOException ex)
  {
    System.out.println ("Error writing to file; Please try again");
    addInfo();
  }
} // for whole method
  
  public void viewDayInfo()
  {
    Scanner kbReader = new Scanner (System.in);
   // int daySelection = 0;
    day = " ";
    
    System.out.println ("1. Monday");
    System.out.println ("2. Tuesday");
    System.out.println ("3. Wednesday");
    System.out.println ("4. Thursday");
    System.out.println ("5. Friday");
    System.out.println ("6. Saturday");
    System.out.println ("7. Sunday");
    System.out.println ("Which day would you like to see the records for?");

     if (!kbReader.hasNextInt())
   {
      System.out.println ("Please enter an integer ranging from 1-7");
      viewDayInfo();
    }
    
  int daySelection = kbReader.nextInt();
    
    switch (daySelection)
    {
      case 1:
      {
        day = "Day: Monday";
        for (int x =0;x<count;x++)
        {
          if (day.equalsIgnoreCase(infoArray[x].fetchDay()))
          {

          System.out.println(infoArray[x].fetchName());
          System.out.println(infoArray[x].fetchDay());
          System.out.println(infoArray[x].fetchDate());
          System.out.println(infoArray[x].fetchActivity());
          System.out.println(infoArray[x].fetchObservation());
          System.out.println(infoArray[x].fetchObservation2());
          System.out.println(infoArray[x].fetchMonHours());
         // System.out.println(infoArray[x].fetchEmpty());
          }
        }// end of for loop
        break;
      }// end of case 1
      
      case 2:
      {
        day = "Day: Tuesday";
        for (int x=0;x<count;x++)
        {
          if (day.equalsIgnoreCase(infoArray[x].fetchDay()))
          {
            System.out.println(" ");
            System.out.println(infoArray[x].fetchName());
            System.out.println(infoArray[x].fetchDay());
            System.out.println(infoArray[x].fetchDate());
            System.out.println(infoArray[x].fetchActivity());
            System.out.println(infoArray[x].fetchObservation());
            System.out.println(infoArray[x].fetchObservation2());
            System.out.println(infoArray[x].fetchTuesHours());
            System.out.println(infoArray[x].fetchEmpty());
          }
        }
        break;
      }// end of case 2
      
      case 3:
      {
        day = "Day: Wednesday";
        for(int x=0;x<count;x++)
        {if (day.equalsIgnoreCase(infoArray[x].fetchDay()))
          {
          System.out.println(infoArray[x].fetchName());
          System.out.println(infoArray[x].fetchDay());
          System.out.println(infoArray[x].fetchDate());
      
          System.out.println(infoArray[x].fetchActivity());
          System.out.println(infoArray[x].fetchObservation());
          System.out.println(infoArray[x].fetchObservation2());
          System.out.println(infoArray[x].fetchWedHours());
          System.out.println(infoArray[x].fetchEmpty());
        }
        }
        break;
      }// end of case 3
      
      case 4:
      {
        day = "Day: Thursday";
        for(int x=0;x<count;x++) 
        {
          if (day.equalsIgnoreCase(infoArray[x].fetchDay()))
          {
            System.out.println(infoArray[x].fetchName());
          System.out.println(infoArray[x].fetchDay());
          System.out.println(infoArray[x].fetchDate());
          System.out.println(infoArray[x].fetchActivity());
          System.out.println(infoArray[x].fetchObservation());
          System.out.println(infoArray[x].fetchObservation2());
          System.out.println(infoArray[x].fetchThursHours());
          System.out.println(infoArray[x].fetchEmpty());
        }
        }
        break;
      }// end of case 4
      
      case 5:
      {
        day = "Day: Friday";
        for(int x=0;x<count;x++) 
        {
          if (day.equalsIgnoreCase(infoArray[x].fetchDay()))
          {
            System.out.println(infoArray[x].fetchName());
          System.out.println(infoArray[x].fetchDay());
          System.out.println(infoArray[x].fetchDate());
      
          System.out.println(infoArray[x].fetchActivity());
          System.out.println(infoArray[x].fetchObservation());
          System.out.println(infoArray[x].fetchObservation2());
          System.out.println(infoArray[x].fetchFriHours());
          System.out.println(infoArray[x].fetchEmpty());
        }
        }
        break;
        
      }// end of case 5
      
      case 6:
      {
        day = "Day: Saturday";
        for(int x=0;x<count;x++) 
        {if (day.equalsIgnoreCase(infoArray[x].fetchDay()))
          {
          System.out.println(infoArray[x].fetchName());
          System.out.println(infoArray[x].fetchDay());
          System.out.println(infoArray[x].fetchDate());
          System.out.println(infoArray[x].fetchActivity());
          System.out.println(infoArray[x].fetchObservation());
          System.out.println(infoArray[x].fetchObservation2());
          System.out.println(infoArray[x].fetchSatHours());
          System.out.println(infoArray[x].fetchEmpty());
        }
        }
        break;
      }// end of case 6
        
      case 7:
      {
        day = "Day: Sunday";
        for(int x=0;x<count;x++) 
        {if (day.equalsIgnoreCase(infoArray[x].fetchDay()))
          {
          System.out.println(infoArray[x].fetchName());
          System.out.println(infoArray[x].fetchDay());
          System.out.println(infoArray[x].fetchDate());
         
          System.out.println(infoArray[x].fetchActivity());
          System.out.println(infoArray[x].fetchObservation());
          System.out.println(infoArray[x].fetchObservation2());
          System.out.println(infoArray[x].fetchSunHours());
          System.out.println(infoArray[x].fetchEmpty());
        }
        }
        break;
      }// end of case 7
      
      default:
      {
        System.out.println ("Please enter a number ranging from 0-7 please!");
        //viewDayInfo();
        break;
      }
    } // end of daySelection switch   
  }// for view day info
  
  public void viewWeekInfo()
  {
    for(int x= 0; x< count; x++)
    {
      
          System.out.println(infoArray[x].fetchName());
          System.out.println(infoArray[x].fetchDay());
          System.out.println(infoArray[x].fetchDate());
          
          System.out.println(infoArray[x].fetchActivity());
          System.out.println(infoArray[x].fetchObservation());
          System.out.println(infoArray[x].fetchObservation2());
          System.out.println(infoArray[x].fetchEmpty());
          
          System.out.println(infoArray[x].fetchMonHours());
          System.out.println(infoArray[x].fetchTuesHours());
          System.out.println(infoArray[x].fetchWedHours());
          System.out.println(infoArray[x].fetchThursHours());
          System.out.println(infoArray[x].fetchFriHours());
          System.out.println(infoArray[x].fetchSatHours());
          System.out.println(infoArray[x].fetchSunHours());
          
    }
  } // end of viewWeekInfo method

  
  public void emergancyContactAdd()
  {
    Scanner kb = new Scanner (System.in);
    System.out.println ("Which client would you like to view emergency contacts for?");
    System.out.println("1. Kenze");
    System.out.println("2. Zac");
    System.out.println("3. Julie");
    
    
    if(!kb.hasNextInt())
    {
      System.out.println("Please enter an integer: 1 or 2");
      emergancyContactAdd();
    }
    
    int emergancyContact = kb.nextInt();
    
    switch (emergancyContact)
    {
      case 1:
      {
        System.out.println("Client name: Kenze");
        System.out.println("Mother: 571-346-9898");
        System.out.println("Father: 571-903-4044");
        System.out.println("Doctor's number: 703-983-5267");
        System.out.println("Emergency Contact: 703-239-9090");
        System.out.println("Grandmother: 501-234-9898"); 
        break;
      }// for case 1 
      
      case 2:
      {
        System.out.println("Client name: Zac");
        System.out.println("Mother: 571-386-6878");
        System.out.println("Father: 571-983-4532");
        System.out.println("Doctor's number: 703-767-2323");
        System.out.println("Emergency Contact: 703-989-2350");
        System.out.println("Grandmother: 703-223-9425"); 
        break;
      }
      
      case 3:
      {
        System.out.println("Client name: Julie");
        System.out.println("Mother: 571-322-3398");
        System.out.println("Father: 571-502-44504");
        System.out.println("Doctor's number: 703-893-5367");
        System.out.println("Emergency Contact: 703-989-9230");
        System.out.println("Grandmother: 702-574-9898"); 
        break;
      }
      default:
      {
        System.out.println ("Please enter 1,2, or 3 please!");
        break;
      }
        
        
      }// for the switch       
  } // emergancy Contact
  
  public void estimatedDayPay()
  {
    Scanner kbReader=  new Scanner (System.in);
    System.out.println ("How many hours did you work today?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
      
    }
    double estimatedHours = kbReader.nextDouble();
    double total = (9.75 * estimatedHours);
    NumberFormat fmt = NumberFormat.getNumberInstance();
    fmt.setMaximumFractionDigits(2);
    fmt.setMinimumFractionDigits(2);
    String s = fmt.format(total);
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String str = nf.format (total);
    System.out.println ("Your estimated pay is " + str + " for that day");
  }
  
  public void estimatedWeekPay()
  {
    Scanner kbReader= new Scanner (System.in);
    System.out.println ("How many hours did you work on Monday?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
      
    }
    int mondayHours = kbReader.nextInt();
    
    System.out.println ("How many hours did you work on Tuesday?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
      
    }
    int tuesdayHours = kbReader.nextInt();
    
    System.out.println ("How many hours did you work on Wednesday?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
      
    }
    int wednesdayHours = kbReader.nextInt();
    
    System.out.println ("How many hours did you work on Thursday?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
     
    }
    int thursdayHours = kbReader.nextInt();
    
    System.out.println ("How many hours did you work on Friday?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
     
    }
    int fridayHours = kbReader.nextInt();
    
    System.out.println ("How many hours did you work on Saturday?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
      
    }
    int saturdayHours = kbReader.nextInt();
    
    System.out.println ("How many hours did you work on Sunday?");
    while (!kbReader.hasNextDouble())
    {
      String trash = kbReader.next();
      System.out.println("Please enter in an integer form!");
      estimatedWeekPay();
    }
    int sundayHours = kbReader.nextInt();
    
    double totalHours = (mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours);
    double totalIncome = (9.75 * totalHours);
    
    NumberFormat fmt = NumberFormat.getNumberInstance();
    fmt.setMaximumFractionDigits(2);
    fmt.setMinimumFractionDigits(2);
    String s = fmt.format(totalIncome);
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    String str = nf.format (totalIncome);
    System.out.println ("Your estimated pay is " + str + " for that week");

    
  }
  
  
  

 
  
}// end of program
 
        
     
      
      

  
  
  
  


    
      
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
