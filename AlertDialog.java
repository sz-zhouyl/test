new  AlertDialog.Builder(context)
.setTitle("确认" )
.setMessage("确定吗？" )
.setPositiveButton("是" ,  null )
.setNegativeButton("否" , null)
.show();

  AlertDialog.Builder builder = new Builder(MainActivity.this);
  builder.setTitle("请输入");
  builder.setIcon(R.drawable.ic_launcher);
  builder.setView(new EditText(MainActivity.this));
  builder.setPositiveButton("是" ,  null );
  builder.setNegativeButton("否", null);
  builder.show();


//===================PopupWindow================================================  
        private void showPopupWindow(Context context,View parent) {
            //LayoutInflater的作用是用来动态加载Layout文件的   
            LayoutInflater inflater = LayoutInflater.from(context);    
            final View popupView = inflater.inflate( R.layout.popup_window, null);//动态加载Layout文件    
            final PopupWindow pWindow = new PopupWindow(popupView,200,200,true);//需要填写宽高，否则显示不了   
            final Button button=(Button)popupView.findViewById(R.id.BtnOK);//加载之后可以找到其中的控件了  
            button.setOnClickListener(new OnClickListener(){
                @Override    
                public void onClick(View v) {
                    //设置文本框内容    
                    EditText edtUsername=(EditText)popupView.findViewById(R.id.data_edit);    
                    edtUsername.setText("关注微信：传说之路");     
                }
            });    
          //Cancel按钮及其处理事件    
            Button btnCancel=(Button)popupView.findViewById(R.id.BtnCancel);    
            btnCancel.setOnClickListener(new OnClickListener(){
                @Override    
                public void onClick(View v) {
                    pWindow.dismiss();//关闭    
                }
            });    
            //显示popupWindow对话框    
            pWindow.showAtLocation(parent, Gravity.CENTER, 0, 0);    
          
           
        }
    }
}



	handler.post(new Runnable() {
		public void run() {
			//...
		}
	});
