IO

字节流 InputStream  OutputStream

文件 FileOutputStream  FileInputStream

数据 DataInputStream   DataOutputStream

对象 ObjectInputStream  ObjectOutputStream（对象必须实现序列化接口）

字符流 InputStreamReader  OutputStreamWriter 

缓冲流 BufferedReader BufferedWriter   BufferedInputStream   BufferedOutputStream

输入流 System.in  从标准输入设备输入内容：键盘；

输出流 System.out  往标准输出设备输出，显示器；

标准错误输出流：System.err

字节打印流(标准输出流) ：PrintStream



```
InputStream
    is.read(): 返回的是字符代表的整数值；读到文件结尾（没有内容可读了），返回-1;
	is.read(b); 每次读进一个byte数组；
    is.available():
    //结合StringBuilder,将字节拼成一个字符串
    //StringBuffer是线程安全的因为方法都加了synchronized修饰，而StringBuilder则没有实现线程安全功能，所以性能略高。
        StringBuilder sBuilder=new StringBuilder();
        	String str=new String(b);//String的一个构造方法；
        	sBuilder.append(str);
        }
        
OutputStream
    os.write(int b); 一个字节一个字节地写；
    os.write(b);
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

