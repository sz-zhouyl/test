new  AlertDialog.Builder(context)
.setTitle("ȷ��" )
.setMessage("ȷ����" )
.setPositiveButton("��" ,  null )
.setNegativeButton("��" , null)
.show();

  AlertDialog.Builder builder = new Builder(MainActivity.this);
  builder.setTitle("������");
  builder.setIcon(R.drawable.ic_launcher);
  builder.setView(new EditText(MainActivity.this));
  builder.setPositiveButton("��" ,  null );
  builder.setNegativeButton("��", null);
  builder.show();


//===================PopupWindow================================================  
        private void showPopupWindow(Context context,View parent) {
            //LayoutInflater��������������̬����Layout�ļ���   
            LayoutInflater inflater = LayoutInflater.from(context);    
            final View popupView = inflater.inflate( R.layout.popup_window, null);//��̬����Layout�ļ�    
            final PopupWindow pWindow = new PopupWindow(popupView,200,200,true);//��Ҫ��д��ߣ�������ʾ����   
            final Button button=(Button)popupView.findViewById(R.id.BtnOK);//����֮������ҵ����еĿؼ���  
            button.setOnClickListener(new OnClickListener(){
                @Override    
                public void onClick(View v) {
                    //�����ı�������    
                    EditText edtUsername=(EditText)popupView.findViewById(R.id.data_edit);    
                    edtUsername.setText("��ע΢�ţ���˵֮·");     
                }
            });    
          //Cancel��ť���䴦���¼�    
            Button btnCancel=(Button)popupView.findViewById(R.id.BtnCancel);    
            btnCancel.setOnClickListener(new OnClickListener(){
                @Override    
                public void onClick(View v) {
                    pWindow.dismiss();//�ر�    
                }
            });    
            //��ʾpopupWindow�Ի���    
            pWindow.showAtLocation(parent, Gravity.CENTER, 0, 0);    
          
           
        }
    }
}



	handler.post(new Runnable() {
		public void run() {
			//...
		}
	});
