package com.bulbulhossen.textsurfacetutorial.Surface_Package;

import android.content.res.AssetManager;
import android.graphics.Color;

import su.levenetc.android.textsurface.contants.Align;
import su.levenetc.android.textsurface.contants.TYPE;
import su.levenetc.android.textsurface.Text;
import su.levenetc.android.textsurface.TextBuilder;
import su.levenetc.android.textsurface.TextSurface;
import su.levenetc.android.textsurface.animations.Alpha;
import su.levenetc.android.textsurface.animations.ChangeColor;


public class ColorSample {
	public static void play(TextSurface textSurface, AssetManager assets) {

		Text textA = TextBuilder
				.create("ANDROID DEVELOPER , BULBUL")
				.setPosition(Align.SURFACE_CENTER)
				.setSize(15)
				.setAlpha(0)
				.build();

		textSurface.play(TYPE.SEQUENTIAL,
				Alpha.show(textA, 1000),
				ChangeColor.to(textA, 1000, Color.RED),
				ChangeColor.fromTo(textA, 1000, Color.BLUE, Color.CYAN),
				Alpha.hide(textA, 5000)
		);
	}
}
