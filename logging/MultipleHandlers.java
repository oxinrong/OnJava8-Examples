// logging/MultipleHandlers.java
// (c)2016 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://mindviewinc.com/Books/OnJava/ for more book information.
// {ErrorOutputExpected}
import java.util.logging.*;

public class MultipleHandlers {
  private static Logger logger =
    Logger.getLogger("MultipleHandlers");
  public static void
  main(String[] args) throws Exception {
    FileHandler logFile =
      new FileHandler("MultipleHandlers.xml");
    logger.addHandler(logFile);
    logger.addHandler(new ConsoleHandler());
    logger.warning(
      "Output to multiple handlers");
  }
}
/* Output:
___[ Error Output ]___
Dec 15, 2015 9:58:43 PM MultipleHandlers main
WARNING: Output to multiple handlers
Dec 15, 2015 9:58:43 PM MultipleHandlers main
WARNING: Output to multiple handlers
___[ Error Output is Expected ]___
*/
