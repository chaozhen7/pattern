package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sina Email:chaozhen7@163.com
 * @date 2016年8月8日 下午7:29:39
 * @version 1.0
 */
public class DeviceFactory {
	private List<NetworkDevice> devices = new ArrayList<>();
	private int totalTerminal;

	public DeviceFactory() {
		NetworkDevice nd1 = new Switch("Cisco-WS-C2950-24");
		devices.add(nd1);
		NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
		devices.add(nd2);
	}

	public NetworkDevice getNetworkDevice(String type) {
		if (type.equalsIgnoreCase("cisco")) {
			totalTerminal++;
			return (NetworkDevice) devices.get(0);
		} else if (type.equalsIgnoreCase("tp")) {
			totalTerminal++;
			return (NetworkDevice) devices.get(1);
		} else {
			return null;
		}
	}

	public int getTotalDevice() {
		return devices.size();
	}

	public int getTotalTerminal() {
		return totalTerminal;
	}
}
