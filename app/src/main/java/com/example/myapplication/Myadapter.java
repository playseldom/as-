package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.zip.Inflater;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myholder> {//打小气泡 放行传入

    //视图Holder指向行的指针
    Context context1;
    List<String> list1;//没有给定节点类型

    //每一行一个textview与viewholder进行绑定
    public Myadapter(Context context,List list){
        context1=context;
        list1=list;

    }
    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(context1).inflate(R.layout.item,parent,false);
        //压缩list
        ;//布局的压缩
//        Inflater inflater=new Inflater();
//        inflater.inflate(); 真正的压缩
        Myholder myholder=new Myholder(view);

        return myholder;
    }

    @Override//绑定 上数据
    public void onBindViewHolder(@NonNull Myholder holder, int position) {

        holder.textView.setText(list1.get(position));//用于设置TextView的文本内容为数据列表list1中指定位置的数据
        // 将颜色设置为红色
        holder.textView.setTextColor(Color.RED);

    }


    @Override//行数
    public int getItemCount() {
        return list1.size();
    }
    public class Myholder extends RecyclerView.ViewHolder{
        TextView textView;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView11);//引用item.xml里id为textView1的textView作为Myholder这个类中
            //textView对象的初始值
        }
    }

}