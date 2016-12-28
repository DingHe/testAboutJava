package com.zzx.ik;

import java.io.StringReader;

import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;


public class testIK {
	public static void main(String[] args) {
		String text = "在中国进入全面建成小康社会决定性阶段，胡锦涛同志所作的十八大报告，浓缩了改革开放以来特别是最近十年来党领导中国发展建设的经验与启示，勾画出中国未来发展的蓝图。报告中的新表述、新思想、新论断，引发了与会代表和各界干部群众的广泛关注。"; 
		
		StringReader re = new StringReader(text);
		IKSegmenter ik = new IKSegmenter(re,true);
		Lexeme lex = null;
		try {
				while((lex=ik.next()) != null){
					System.out.print(lex.getLexemeText()+"|");
			
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
