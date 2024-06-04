package calculator_module;


/**
* calculator_module/CalculatorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from calculator.idl
* Sunday, April 21, 2024 9:22:13 AM IST
*/

public abstract class CalculatorPOA extends org.omg.PortableServer.Servant
 implements calculator_module.CalculatorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("add", new java.lang.Integer (0));
    _methods.put ("subtract", new java.lang.Integer (1));
    _methods.put ("multiply", new java.lang.Integer (2));
    _methods.put ("divide", new java.lang.Integer (3));
    _methods.put ("shutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // calculator_module/Calculator/add
       {
         int a = in.read_long ();
         int b = in.read_long ();
         int $result = (int)0;
         $result = this.add (a, b);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 1:  // calculator_module/Calculator/subtract
       {
         int a = in.read_long ();
         int b = in.read_long ();
         int $result = (int)0;
         $result = this.subtract (a, b);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 2:  // calculator_module/Calculator/multiply
       {
         int a = in.read_long ();
         int b = in.read_long ();
         int $result = (int)0;
         $result = this.multiply (a, b);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 3:  // calculator_module/Calculator/divide
       {
         int a = in.read_long ();
         int b = in.read_long ();
         int $result = (int)0;
         $result = this.divide (a, b);
         out = $rh.createReply();
         out.write_long ($result);
         break;
       }

       case 4:  // calculator_module/Calculator/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:calculator_module/Calculator:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calculator _this() 
  {
    return CalculatorHelper.narrow(
    super._this_object());
  }

  public Calculator _this(org.omg.CORBA.ORB orb) 
  {
    return CalculatorHelper.narrow(
    super._this_object(orb));
  }


} // class CalculatorPOA