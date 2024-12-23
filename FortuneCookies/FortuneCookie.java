import java.util.Random;
import java.util.Scanner;

public class FortuneCookie {
  //Array of messages to be used in the program
  static String[] msgs = {"A beautiful, smart, and loving person will be coming into your life."
  ,"A dubious friend may be an enemy in camouflage."
  ,"A faithful friend is a strong defense."
  ,"A feather in the hand is better than a bird in the air."
  ,"A fresh start will put you on your way."
  ,"A friend asks only for your time, not your money."
  ,"A friend is a present you give yourself."
  ,"A gambler not only will lose what he has, but also will lose what he doesn’t have."
  ,"A golden egg of opportunity falls into your lap this month."
  ,"A good friendship is often more important than a passionate romance."
  ,"A good time to finish up old tasks."
  ,"A hunch is creativity trying to tell you something."
  ,"A lifetime friend shall soon be made."
  ,"A lifetime of happiness lies ahead of you."
  ,"A light heart carries you through all the hard times."
  ,"A new perspective will come with the new year."
  ,"A person is never too old to learn."
  ,"A person of words and not deeds is like a garden full of weeds."
  ,"A pleasant surprise is waiting for you."
  ,"A short pencil is usually better than a long memory any day."
  ,"A small donation is call for. It’s the right thing to do."
  ,"A smile is your personal welcome mat."
  ,"A smooth long journey! Great expectations."
  ,"A soft voice may be awfully persuasive."
  ,"A truly rich life contains love and art in abundance."
  ,"Accept something that you cannot change, and you will feel better."
  ,"Adventure can be real happiness."
  ,"Advice is like kissing. It costs nothing and is a pleasant thing to do."
  ,"Advice, when most needed, is least heeded."
  ,"All will go well with your new project."
  ,"All your hard work will soon pay off."
  ,"Allow compassion to guide your decisions."
  ,"An acquaintance of the past will affect you in the near future."
  ,"An agreeable romance might begin to take on the appearance."
  ,"An important person will offer you support."
  ,"An inch of time is an inch of gold."
  ,"An unexpected relationship will become permanent."
  ,"Anger begins with folly, and ends with regret."
  ,"Anger is the seed for war. Understanding is the seed for peace."
  ,"Any decision you have to make tomorrow is a good decision."
  ,"At the touch of love, everyone becomes a poet."
  ,"Be careful or you could fall for some tricks today."
  ,"Beauty in its various forms appeals to you."
  ,"Because you demand more from yourself, others respect you deeply."
  ,"Believe in yourself and others will too."
  ,"Believe it can be done."
  ,"Better ask twice than lose yourself once."
  ,"Bide your time, for success is near."
  ,"Change is happening in your life, so go with the flow!"
  ,"Character is who you are when no one is watching."};
  
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  Random rand = new Random();
  char choice = 'y';

  while(choice == 'y'){
    int randomIndex = rand.nextInt(msgs.length); // Generate random numbers dynamically by getting the length
  
    System.out.println("Your cookie says: ");
    System.out.println(msgs[randomIndex]);

    do {
      System.out.print("\nDo you want to open another cookie? [y/n] ");
      choice = Character.toLowerCase(input.next().charAt(0));
      input.nextLine(); // Consume the newline character
      if (choice != 'y' && choice != 'n') {
        System.out.println("Invalid input. Please enter 'y' or 'n'.");
      }
    } while (choice != 'y' && choice != 'n');
  }
  System.out.println("Hope you liked the cookies <3.");
  }
}
