package org.deta.pixes.process;
//1.1 像素的总和
//1.2 像素的主要颜色总和
//1.3 像素的特殊颜色总和
//1.4 像素的特征颜色的统计

//在设计这个api之前，我的德塔数据预测包已经有了像素的坐标存储函数
//AMV_MVS_VSQ_2D，2维坐标，对应图片中像素的坐标。
//那就开始了
//作者 罗瑶光
public interface ColorProcess{
	//1.1 像素的总和
	//首先，我需要一个图片，然后从图片中读取标准的三原色，和它的总数。
	
	//1.2 像素的主要颜色总和
	//关于像素的主要颜色 我定位在七彩色，红橙黄绿青靛紫。
	
	//1.3 像素的特殊颜色总和
	//关于像素的主要颜色 我定位在21颜色阶， 浅红深， 浅橙深， 浅黄深， 浅绿深， 浅青深， 浅靛深， 浅紫深
	
	//1.4 像素的特征颜色的统计
	//关于像素的特征颜色 我定位在输入某一个rgb ，某一个颜色阶段， 某一个区间，输出需求的颜色统计。
	
	
	//1.1 像素的总和
	//首先，我需要一个图片，然后从图片中读取标准的三原色，和它的总数。
	public int readPixesAndReturnAmountOfPixes(int[][] pixes);// >0
	public int readBufferedImageAndReturnAmountOfRedPixGroup(BufferedImage bufferedImage);
	public int readBufferedImageAndReturnAmountOfGreenPixGroup(BufferedImage bufferedImage);
	public int readBufferedImageAndReturnAmountOfBluePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfRGBPixGroup(BufferedImage bufferedImage);
	public int[] readPixesAndReturnAmountsOfRGBPixGroup(int[][][] pixes, String arranges);
	
	//1.2 像素的主要颜色总和
	//关于像素的主要颜色 我定位在七彩色，红橙黄绿青靛紫。
	public int[] readBufferedImageAndReturnAmountsOfPCARedPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAGreenPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCABluePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAYellowPixGroup(BufferedImage bufferedImage);
	//我用了pink 哈哈
	public int[] readBufferedImageAndReturnAmountsOfPCAPinkPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCACyanPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAPurplePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAOrangePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAPixGroup(BufferedImage bufferedImage, String arranges);
	
	//1.2 像素的主要颜色总和
	//关于像素的主要颜色 我定位在七彩色，红橙黄绿青靛紫。
	public int readPixesAndReturnAmountOfPCARedPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAGreenPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCABluePixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAYellowPixGroup(int[][][] pixes);
	//我用了pink 哈哈
	public int readPixesAndReturnAmountOfPCAPinkPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCACyanPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAPurplePixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAOrangePixGroup(int[][][] pixes);
	public int[] readPixesAndReturnAmountsOfPCAPixGroup(int[][][] pixes, String arranges);
	
	//1.3 像素的特殊颜色总和
	//关于像素的主要颜色 我定位在21颜色阶， 浅红深， 浅橙深， 浅黄深， 浅绿深， 浅青深， 浅靛深， 浅紫深

	public int[] readBufferedImageAndReturnAmountsOfICARedPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAGreenPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICABluePixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAYellowPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	//我用了pink 哈哈
	public int[] readBufferedImageAndReturnAmountsOfICAPinkPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICACyanPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAPurplePixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAOrangePixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	
	public int[] readPixesAndReturnAmountsOfICARedPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAGreenPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICABluePixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAYellowPixGroup(int[][][] pixes, String arranges, int sections);
	//我用了pink 哈哈
	public int[] readPixesAndReturnAmountsOfICAPinkPixGroup(int[][][] pixes, String arranges, int sections);
	
	public int[] readPixesAndReturnAmountsOfICACyanPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAPurplePixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAOrangePixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAPixGroup(int[][][] pixes, String arranges, int sections);
	
	//1.4 像素的特征颜色的统计
	//关于像素的特征颜色 我定位在输入某一个rgb ，某一个颜色阶段， 某一个区间，输出需求的颜色统计。
	public int readPixesAndReturnAmountOfPCADeterminatedPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICADeterminatedPixGroup(int[][][] pixes, String arranges, int sections);
	
	//arranges如红色，蓝色。。。arranges="RB"   如红色，绿色。。。arranges="RG"
	//sections分层如 5， 红色区间分5层，8 红色区间分8层. 意味着 255,255,255的三原色        (65535/7) /分层  方便理解。
}	
	
