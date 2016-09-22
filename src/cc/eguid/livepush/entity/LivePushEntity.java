package cc.eguid.livepush.entity;

import java.io.Serializable;

public class LivePushEntity implements Serializable {
	private static final long serialVersionUID = -1580871796857185739L;

	public LivePushEntity() {
		super();
	}

	/**
	 * 示例： appName="test123"
	 * input="rtsp://admin:admin@192.168.2.236:37779/cam/realmonitor?channel=1&subtype=0"
	 * output="rtmp://192.168.30.21/live/" codec="h264" fmt="flv" fps="25"
	 * rs="640x360" twoPart="2" twoPart：0-推一个元码流；1-推一个自定义推流；2-推两个流（一个是自定义，一个是元码）
	 */

	public LivePushEntity(String appName, String input, String output, String codec, String fmt, String fps, String rs,
			String twoPart) {
		super();
		this.appName = appName;
		this.input = input;
		this.output = output;
		this.fmt = fmt;
		this.fps = fps;
		this.rs = rs;
		this.codec = codec;
		this.twoPart = twoPart;
	}

	/**
	 * 应用名
	 */
	private String appName;

	/**
	 * 视频源地址，可以是实时流地址也可以是文件路径
	 */
	private String input;

	/**
	 * 实时流输出地址，这个默认是固定的rtmp服务器发布地址
	 */
	private String output;

	/**
	 * 视频格式，默认flv
	 */
	private String fmt;

	/**
	 * 帧率，最好是25-60
	 */
	private String fps;

	/**
	 * 分辨率，例如：640x360
	 */
	private String rs;

	/**
	 * 视频编码
	 */
	private String codec;
	/**
	 * twoPart：0-推一个元码流；1-推一个自定义推流；2-推两个流（一个是自定义，一个是元码）
	 */
	private String twoPart;

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName
	 *            the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}

	/**
	 * @param input
	 *            the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}

	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * @param output
	 *            the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}

	/**
	 * @return the fmt
	 */
	public String getFmt() {
		return fmt;
	}

	/**
	 * @param fmt
	 *            the fmt to set
	 */
	public void setFmt(String fmt) {
		this.fmt = fmt;
	}

	/**
	 * @return the fps
	 */
	public String getFps() {
		return fps;
	}

	/**
	 * @param fps
	 *            the fps to set
	 */
	public void setFps(String fps) {
		this.fps = fps;
	}

	/**
	 * @return the rs
	 */
	public String getRs() {
		return rs;
	}

	/**
	 * @param rs
	 *            the rs to set
	 */
	public void setRs(String rs) {
		this.rs = rs;
	}

	/**
	 * @return the codec
	 */
	public String getCodec() {
		return codec;
	}

	/**
	 * @param codec
	 */
	public void setCodec(String codec) {
		this.codec = codec;
	}

	public String getTwoPart() {
		return twoPart;
	}

	public void setTwoPart(String twoPart) {
		this.twoPart = twoPart;
	}

}
