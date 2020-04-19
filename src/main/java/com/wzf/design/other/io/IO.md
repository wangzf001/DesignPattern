IO
输出流有flush()方法，先flush(),后close()

字节流 InputStream  OutputStream

文件 FileOutputStream  FileInputStream

数据 DataInputStream   DataOutputStream

对象 ObjectInputStream  ObjectOutputStream（对象必须实现序列化接口）

字符流 InputStreamReader  OutputStreamWriter 

缓冲流 BufferedReader BufferedWriter   BufferedInputStream   BufferedOutputStream

标准输入流 System.in  从标准输入设备输入内容：键盘；

标准输出流 System.out  往标准输出设备输出，显示器；

标准错误输出流：System.err

字节打印流(标准输出流) ：PrintStream



```
输入流、输出流是对于内存而言；

IO的关闭：
先关外层，再关内层；只关处理流，不关节点流，。如BufferedInputStream包装了一个FileInputStream，那么先
关BufferedInputStream，再关FileInputStream。但要注意的是由于一般处理流持有节点流引用，处理流都会在自己的close方法中去关闭节点流，因此我们只要关闭外层的处理流即可，如果多此一举的关闭节点流反而会报错。如BufferedInputStream包装了FileInputStream，我们只要关闭BufferedInputStream即可



InputStream
    is.read(): 返回的是字符代表的整数值；读到文件结尾（没有内容可读了），返回-1;
    is.read(b); 每次读进一个byte数组，若最后一次不满数组长度，则读取n个字节，n之后为上次内容；数组一般长度为512或1024
    is.read(b,off,len); 每次读byte数组指定长度；
    is.available():
    //结合StringBuilder,将字节拼成一个字符串
    //StringBuffer是线程安全的因为方法都加了synchronized修饰，而StringBuilder则没有实现线程安全功能，所以性能略高。
        StringBuilder sBuilder=new StringBuilder();
        String str=new String(b);//String的一个构造方法；
        sBuilder.append(str);
        
        
OutputStream
    os.write(int b); 一个字节一个字节地写；
    os.write(b);
    os.write(b,off,len);
	OutputStream(抽象类) os=new FileOutputStream(file，true)（子类）；true：表示追加，不是覆盖；
    
字符流 InputStreamReader 
    int temp=reader.read();返回的是一个字符编码所代表的整数；
    InputStream is=new FileInputStream(new File("e:\\f.data"));
    InputStreamReader isr=new InputStreamReader(is);
    InputStreamReader isr=new InputStreamReader(is,"utf-8");//指定字符集；   

	Reader 抽象类；
	FileReader 子类；
        char[] cbuf={'美','丽'};
        reader.read(cbuf, 0, 5);一个字符数组，只读进一部分。
    Writer：抽象类；
    FileWriter：子类；
        writer.write('美');一个字符一个字符地写；
        String str="风吹绿草遍地花";
        writer.write(str);
		writer.flush();

    //创建对象时会开缓冲区； 提高效率；
    BufferedReader
            br.readLine();
    BufferedWriter
            br.newLine();//换行

对象 ObjectInputStream  ObjectOutputStream
    对象必须实现序列化接口；版本识别的作用；transient 不希望被序列化的内容
    
字节数组流 ByteArrayInputStream ByteArrayOutputStream

数据 DataInputStream  DataOutputStream 
	dos.writeInt(n);
    dos.writeUTF(str);
    dos.writeDouble(3.15);
    dos.writeChar('我');
    dos.writeBoolean(true);

键盘输入输出  输入流System.in System.out
    
    	   InputStream is=System.in;
           InputStreamReader isr=new InputStreamReader(is);
           int temp=br.read();

           OutputStream os=System.out;
           OutputStreamWriter osw=new OutputStreamWriter(os);
           BufferedWriter bw=new BufferedWriter(osw);
           bw.write(temp);

           bw.flush();
           bw.close();
           br.close();
标准输出流 PrintStream
     PrintWriter pw=new PrintWriter(new File("e:\\a.txt"));
        //pw.write(str);

--------------------------
1.节点流：

InputStream is=new FileInputStream(file);
OutputStream os=new FileOutputStream（file);

Reader reader=new FileReader(file);
Writer writer=new FileWriter(file);

2.处理流：以节点流为参数，处理的是节点流：增强功能，简化操作；
缓冲流、转换流；

InputStream is=new FileInputStream(file);
OutputStream os=new FileOutputStream（file);
（1）转换流；
InputStreamReader isr=new InputStreamReader(is);
OutputStreamWriter osw=new OutputStreamWriter(os);

(2)字符缓冲流：
Reader reader=new FileReader(file);
Writer writer=new FileWriter(file);

好处：带缓冲区；提高效率

br.readLine();
bw.newLine();

BufferedReader br=new BufferedReader(reader);
BufferedWriter bw=new BufferedWriter(writer);

（3）字节缓冲流：

InputStream is=new FileInputStream(file);
OutputStream os=new FileOutputStream（file);

BufferedInputStream bis=new BufferedInputStream(is);
BufferedOutputStream bos=new BufferedOutputStream(os);

```

