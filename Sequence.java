import java.util.ArrayList;

public class Sequence
{
   private ArrayList<Integer> values;

   public Sequence()
   {
      values = new ArrayList<Integer>();
   }

   public void add(int n)
   {
      values.add(n);
   }

   public String toString()
   {
      return values.toString();
   }
   public int length()
   {
      return values.size();
   }
   public int get(int i)
   {
      return values.get(i);
   }
   public Sequence copyOf(Sequence other)
   {
      Sequence newlist=new Sequence();
      for (int i=0; i<values.size(); i++)
      {
         newlist.add(other.get(i));
      }
      return newlist;
   }

   public Sequence append(Sequence other)
   {  
      Sequence combines = new Sequence();
      ArrayList <Integer> combind = new ArrayList<>(values);
      for (int i=0; i<other.length(); i++)
      {
         combind.add(other.get(i));
      }
      combines.values = combind;
      return combines;
   }
   public Sequence merge(Sequence other)
   {
      Sequence combines = new Sequence();
      int sizes;
      int larger;
      if (values.size()>=other.length())
      {
         sizes = other.length();
      }
      else
      {
         sizes = values.size();
      }
      for (int i=0; i<sizes; i++)
      {
         combines.add(values.get(i));
         combines.add(other.get(i));
      }
      if (values.size()>other.length())
      {
         for (int x= sizes; x<values.size(); x++)
         {
            combines.add(values.get(x));
         }
      }
      else if(values.size()<other.length())
      {
         for (int y=sizes; y<other.length(); y++)
         {
            combines.add(other.get(y));
         }
      }
      return combines;
   }
   public Sequence mergeSorted(Sequence other)
   {
      Sequence sorted=new Sequence();
      int sizes;
      int y=0;
      int value;
      int larger; 
      if(other.length()<values.size())
      {
         sizes=other.length();
      }
      else
      {
         sizes=values.size();
      }
      for(int i=0; i<=sizes; i++)
      {
         if(other.get(i)<values.get(y))
         {
            sorted.add(other.get(i));
         }
         else if(other.get(i)>values.get(y))
         {
            sorted.add(values.get(y));
            y++;
            i--;
         }
         else
         {
            sorted.add(values.get(y));
            sorted.add(other.get(i));
            y++;
         }
      }
      if(values.get(values.size()-1)>sorted.get(sorted.length()-1))
      {
         sorted.add(values.get(values.size()-1));
      }
      else if(other.get(other.length()-1)>sorted.get(sorted.length()-1))
      {
         sorted.add(other.get(other.length()-1));
      }
      return sorted;
   }
   public boolean contains(int n)
   {
      return values.contains(n);
   }
   public Sequence removeDuplicates()
   {
      Sequence list=new Sequence();
      int num;
      for(int i=0; i<values.size(); i++)
      {
         num=values.get(i);
         if (!list.contains(num))
         {
            list.add(num);
         }
         else
         {
            continue;
         }
      }
      return list;
   }
}
