package Day10.Ex04_MultiInterface;

public interface Microphone {
	
	int inputVolumeMax = 50;  // 음성 인식 최대 불륨
	int inputVolumeMIN = 5;  // 음성 인식 최소 불륨

	
	// 음성 인식
	String receiveVoice(String voice);
	
}
