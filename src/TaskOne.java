//package bf;
//import java.util.HashMap;
//import bf.DataBaseException;
//import bf.SysOptionController;
//
//class Tries {
//    private long lastTry;
//    private int tryCount;
//
//    public Tries() {
//        tryCount = 0;
//        lastTry = System.currentTimeMillis();
//    }
//
//    public long getLastTry() {
//        return lastTry;
//    }
//
//    public int getTryCount() {
//        return tryCount;
//    }
//
//    public void addTryCount() {
//        this.tryCount++;
//        lastTry = System.currentTimeMillis();
//    }
//
//    public void reset() {
//        this.tryCount = 0;
//    }
//}
//
//public class BFController {
//    private long lockTime;
//    private int retries;
//    private final HashMap<String, Tries> map = new HashMap<String, Tries>();
//
//    public BFController (SysOptionController soc) throws DataBaseException {
//        synchronize(soc);
//    }
//
//    public final synchronized void synchronize(SysOptionController soc) throws DataBaseException {
//        retries = (Integer) soc.getOption(“retries”).getValue();
//        lockTime = (Integer) soc.getOption(“lockmills”).getValue();
//    }
//
//    public synchronized boolean needWait(String ipAnduser) {
//        Tries t = map.get(ipAnduser);
//        if (t == null) {
//            return false;
//        }
//        if (t.getTryCount() < retries) {
//            return false;
//        }
//        if (t.getLastTry() < System.currentTimeMillis() - lockTime) {
//            return false;
//        }
//        return true;
//    }
//    public synchronized void addTry(String ipAnduser) {
//        Tries t = map.get(ipAnduser);
//        if (t == null) {
//            t = new Tries();
//            map.put(ipAnduser, t);
//        }
//        t.addTryCount();
//    }
//    public synchronized void resetTries(String ipAnduser) {
//        Tries t = map.get(ipAnduser);
//        if (t == null) {
//            return;
//        }
//        t.reset();
//    }
//}