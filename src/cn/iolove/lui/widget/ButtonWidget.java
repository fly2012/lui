package cn.iolove.lui.widget;

import cn.iolove.lui.context.RuntimeContext;
import cn.iolove.lui.model.ButtonModel;
import cn.iolove.lui.model.UIModel;
import cn.iolove.lui.service.LuaService;
import cn.iolove.lui.service.PageService;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ButtonWidget extends AbstractWidget {

	private Button btn;
	public ButtonWidget(UIModel m) {
		super(m);
		btn = new Button(RuntimeContext.getInstance().rl.getActivityContext());
		loadModel();
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getInnerView() {
		// TODO Auto-generated method stub
		return btn;
	}
	

	@Override
	protected void loadModel() {
		WidgetUtils.loadModel(model, this);
		final ButtonModel bm = (ButtonModel)model;
		String str = ((ButtonModel)model).text;
		if(str!=null)
		{
			btn.setText(str);
			
		}
		if(bm.Onclick!=null)
		{
			btn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View button) {
					LuaService.getInstance().excuteLuaFunctionCallBack(bm.Onclick, new Object[]{}, 0);
					
					Log.i("System.err", "������");
				}
			});
		}
		
		
		

	}



}
