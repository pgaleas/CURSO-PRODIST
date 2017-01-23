public class Client extends Ice.Application {
  public int run(String[] args) {

    Ice.ObjectPrx proxyObj = communicator().stringToProxy(args[0]);
  
    Example.PrinterPrx printer = Example.PrinterPrxHelper.checkedCast(proxyObj);

    printer.write("Hello, World!");

    return 0;
  }

  static public void main(String[] args) {
    Client app = new Client();
    app.main("Client", args);
  }
}