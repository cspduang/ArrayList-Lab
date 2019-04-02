public class SequenceDriver
{
   public static void main(String[] args)
   {
      Sequence firstSequence = new Sequence();
      firstSequence.add(1);
      firstSequence.add(4);
      firstSequence.add(9);
      firstSequence.add(16);
      System.out.print("First before: ");
      System.out.println(firstSequence.toString());

      Sequence secondSequence = new Sequence();
      secondSequence.add(9);
      secondSequence.add(7);
      secondSequence.add(4);
      secondSequence.add(9);
      secondSequence.add(11);
      System.out.print("Second before: ");
      System.out.println(secondSequence.toString());

      Sequence combinedSequence = firstSequence.append(secondSequence);
      System.out.print("Appended: ");
      System.out.println(combinedSequence.toString());
      System.out.println("Expected: [1, 4, 9, 16, 9, 7, 4, 9, 11]");

      System.out.print("First after: ");
      System.out.println(firstSequence.toString());

      System.out.print("Second after: ");
      System.out.println(secondSequence.toString());
      System.out.print("Merged: ");
      Sequence mergeresult = firstSequence.merge(secondSequence);
      System.out.println(mergeresult.toString());
      System.out.println("First after: "+ firstSequence);
      System.out.println("Second after: "+ secondSequence);
      System.out.print("Sorted: ");
      Sequence a=new Sequence();
      a.add(1);
      a.add(4);
      a.add(9);
      a.add(16);
      Sequence b=new Sequence();
      b.add(4);
      b.add(7);
      b.add(9);
      b.add(9);
      b.add(11);
      Sequence sortedresult=a.mergeSorted(b);
      System.out.println(sortedresult.toString());
      Sequence d=new Sequence();
      d.add(16);
      d.add(4);
      d.add(9);
      d.add(4);
      d.add(7);
      d.add(9);
      d.add(9);
      d.add(11);
      d.add(16);
      d.add(1);
      Sequence duplicates=new Sequence();
      duplicates=d.removeDuplicates();
      System.out.println("Remove duplicates: ");
      System.out.println("Sequence for duplicates: "+d);
      System.out.print("Result: ");
      System.out.println(duplicates);

   }
}