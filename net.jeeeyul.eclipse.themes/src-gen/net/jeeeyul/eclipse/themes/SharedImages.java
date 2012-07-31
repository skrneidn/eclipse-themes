// Copyright 2012 Jeeeyul Lee, Seoul, Korea
// https://github.com/jeeeyul/pde-tools
//
// This module is multi-licensed and may be used under the terms
// of any of the following licenses:
//
// EPL, Eclipse Public License, V1.0 or later, http://www.eclipse.org/legal
// LGPL, GNU Lesser General Public License, V2.1 or later, http://www.gnu.org/licenses/lgpl.html
// GPL, GNU General Public License, V2 or later, http://www.gnu.org/licenses/gpl.html
// AL, Apache License, V2.0 or later, http://www.apache.org/licenses
// BSD, BSD License, http://www.opensource.org/licenses/bsd-license.php
// MIT, MIT License, http://www.opensource.org/licenses/MIT
//
// Please contact the author if you need another license.
// This module is provided "as is", without warranties of any kind.
package net.jeeeyul.eclipse.themes;

import java.net.URL;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/*
 * Generated by PDE Tools.
 */
public class SharedImages{
	
	/**
	 * <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAAadEVYdFNvZnR3YXJlAFBhaW50Lk5FVCB2My41LjEwMPRyoQAAAHlJREFUKFNjONvaKgPE9lAsygAFQL4okrgMA4hzID39//7k5P9Atj8Q80OxP0gMJAdSA1YIEtgZFvZ/b0ICSDAehEFskBjUALBCkBX+MIldkZH/QRhJI8gWiJOgVsWDFGwPCABjEBtqOj/M3cQpJNpqUjxDdPAQFeAABZ7MoR/tUJQAAAAASUVORK5CYII=">
	 * Image constant for icons/close-active.png
	 */
	public static final String CLOSE_ACTIVE = "icons/close-active.png";
	
	/**
	 * <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAoAAAAKCAYAAACNMs+9AAAABGdBTUEAALGPC/xhBQAAAAlwSFlzAAAOvwAADr8BOAVTJAAAABp0RVh0U29mdHdhcmUAUGFpbnQuTkVUIHYzLjUuMTAw9HKhAAAAZ0lEQVQoU2NgIAVUVlYmAvF1INaA6QOxgfgaEGfAzYIqmgWikRSCNILE+pAVgnSDBMGKkTSC+HBbkDXAFINpnM5HMhW7QqjDYW5CNhXFgwzIbkLyDNzNyG4rgFqLHDySULFoUoKaAQCCfF8Q7f0kfgAAAABJRU5ErkJggg==">
	 * Image constant for icons/close-normal.png
	 */
	public static final String CLOSE_NORMAL = "icons/close-normal.png";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQANUAAM3JysvHycTAxr65wr+7w7eyv7KsvbOuvqagt6ehuKKctoJ6poqDqpSOr29mnnRsoH53pVpRlFxTlWRcmWtjnHVuoV1VlnOG7+Xi1d7b0uDc0t3Z0dfUztvX0NnVz9LOzP///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAACAALAAAAAAQABAAAAZRQJBwSCwaj0jh5mAoaJIZRmQakTQwxg2Fyq1giQuuuEEMiMWSjvDCbrvfwsZZnFi/723hYM79EB18ERBFABZzExxGHw9iEB5JBAoNCAJJlkJBADs=">
	 * Image constant for icons/eclipse.gif
	 */
	public static final String ECLIPSE = "icons/eclipse.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAKIAADdSlm2LsqK1zitXj4egwEF0qMDR4v///yH5BAEAAAcALAAAAAAQABAAAAM1eLrc/jBKI5kZVV2cC+HHNhRWIXBGYVyUNrxcgRUAM1BfeB9DsOw8EgtGks1eFBkrw2w6KwkAOw==">
	 * Image constant for icons/font.gif
	 */
	public static final String FONT = "icons/font.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAOZqAJOQh+35/9Xz/9fz//P9/uj6/+v6/fn9/9bz//v9//P9/+r5//P7/uv6//j+/vn7//n+/2BaQfH9/+v5/2RXQfr+/WNXQXtqNWxfPO36/vv//9Xz/l9ZQdb1/4JvN5J1MvH6//P7//X9//b9/en7+4NuNylrvY53MPH7/2RZRCpquSdhpu37/ypbmen4/yheovn//cXl/9P1+2NcPmFZQZR6L/b+/9Dp/yhalClXkihnsKLT9ZDG8ytbkyhvxfr//ylXjvb6/2JXPCluwypuv4e/7vP+/yllq3JjPGFaPyduxIpyMdfv++/6/ydbmoC/6ilXkytfoGFaPmFWP5Z4L+b6/ytVjW1gPipnsPP6/yljqihrt7LW+rze+nJlOiduwyltvmdbQdT1/ylhpNP1/ydwxX5oN4xzMGNXRJvM9v///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAGoALAAAAAAQABAAAAeqgGqCg4SFhoeGQDk4LS9jWlgqYENfhEpPRTxpO1xdMTdMPoRWUD1OUStHOlsmRGWENQIyAgADGwJiAwNUhB8CVQUABS4LBRMGJ4RLAhksAA3HJAsNZ4QeCE0BAAHc3SWEFwgEBAAEIBIoWQpmhEgdQQwAEjYKIUYMXoQYAw4PAA8ORBwYceAKoTBkfiQAAAEGhAQaKswgRENIkghSLKSYgoZDBAqIQoo8FAgAOw==">
	 * Image constant for icons/layout.gif
	 */
	public static final String LAYOUT = "icons/layout.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAAGlpaf///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAhBAP8JHEiwoMGDCBMqXPgvgMOHEA0GEECxIsUAEiFqlGjRIsaCEzte5ChSwEeCIUWeHJiy40qBLT1m1PiQoU2FAQEAOw==">
	 * Image constant for icons/maxmize.gif
	 */
	public static final String MAXMIZE = "icons/maxmize.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAAGlpaf///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAgwAP8JHEiwoMGDBwMoXMgwoYCHEAMg/BcAogCJEyk+xJiRIseOIEOKHEmypMmTIQMCADs=">
	 * Image constant for icons/menu.gif
	 */
	public static final String MENU = "icons/menu.gif";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAAGlpaf///wAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAgwAP8JHEiwoMGDCBMqXPgvgMOHEA0GEECxIsUAEi1axFgQokeODEOKHEmypMmTBQMCADs=">
	 * Image constant for icons/minimize.gif
	 */
	public static final String MINIMIZE = "icons/minimize.gif";
	
	/**
	 * <img src="data:image/gif;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAAadEVYdFNvZnR3YXJlAFBhaW50Lk5FVCB2My41LjEwMPRyoQAAAfxJREFUOE+NU79P22AQ9YhUiYmhY7vRgS7tP9INqXv/kYqhQyUkVLVSxy5dKhakShVFBQlQCpQArpWkOEAck9jExEkcitPEj3tnOXX6S410erm7987P5+8zABj5OHEvUTBreLWSxvutkuas/8plPhZ7lz1sHZxi16rDabYRXcVIkkSROevsk5cfpANY3PhSRd3vAPsP0HotZcHRKMHitzt49PKWIvvk5YfoAE52mh3Eg1Eqjg1F5hQP8Qzzb6YlH8LxOuokc2Hw3XYsB9H3H+hL5B0wzzugijzys50YXJB70UMYxWhLhNEAjaCP7ZKvYZ21cR5caT/ssx/Drge6WF0it8wB8eo9XC/MKFK4aXkaBflfdkI8tu9j6qmhSD51OuDd2pEUIhWjaCjuVFo65Ks8/djtwpE+xS/wRJF86sYOjt1wwoF93kXNj+CFYr0/IHHCgS38sQO+i2l7qNQ7qLgSgifNHlrdGAP5jPzV5IlpPxQMhe//3AG3uX1U02XRclLYx6eHc4rWaRvPzQTGrKmYclL++Ctk58Cs+ihWA6zdvovhx1XFAztQ8dtr2ZZgUXLyJs5BdhLX5YQdirX4w4aKibuViwkH7JP320nMhnDy5uEZ9soNEXv4XPbli3jYKzW0/te7kL8cS8tVXRC3zE+V3UbW/3kb/9T8n9oNU6ZBIaM/d/kAAAAASUVORK5CYII=">
	 * Image constant for icons/palette.gif
	 */
	public static final String PALETTE = "icons/palette.gif";
	
	/**
	 * <img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAEkAAAA5CAYAAAB6UQYdAAAABGdBTUEAALGPC/xhBQAAAAlwSFlzAAAOwQAADsEBuJFr7QAAABp0RVh0U29mdHdhcmUAUGFpbnQuTkVUIHYzLjUuMTAw9HKhAAAE40lEQVR4Xu3SddBUZRTH8VdRLOzuAru7O5BQAQtRsbG7C7sTC4NQKRU7sbsLu7sVCwvr9Xt29u48u3t/573/3OcOM5eZz9z77neHc+bMtrSU/yauC7S2tk7ShknpSjuaMhnNMzldad/iDLVlchvM/91emILPlSlpnqnoytQ0ZRqa0sGOVMhg5nZwTEtTpqMp09OUGWieGemp7Ei2TPTBzJzJMTNNmYXmmZWuzEZTZqelsiPZMtEHM3OONsxJV+aiKXPTlHlonnnpTexIySJRB1eXmY+nMj9NWYDmWZCuLERTFqY1sSMli0QdXF2mI09PJ7qyCE1ZlKYsRvMsTq9jRwqXiDY4WGQJ3pUlacpSNM/SdGUZmrIsrY4dKVwi2uBgkeV49yxPV1agKSvSlJVonpXpNXakxgWiDA6X4H0Vx6o0z2p0ZXWasgZNWZNWY0dKWyD3weES1fe1eCpr05R1aMq6NM96dGV9WoUdKW147oOTBYLnBrwrG9I8G9GVjWnKJjRlU1qFHUkNz3VwskDDszN/K5vRlC40pSvN042udKd1tyMVMtiGp9icz5QtaJ4t6UoPmtKTpvSi9bIjFTLYhgtb8bmyNU3ZhqZsS/NsR1d625EKGczc3sL2fK70oXl2oCs70pSdaEpfO1Ihg5nb17EzTdmFpuxKU3ajeXanp7Ij2TLRBzNzD8eeNE8/urIXTdmbpuxDS2VHSpaJOri60L48lf1oyv405QCa50C6chCtiR0pWSTq4OoyB/NUDqF5DqUrh9GUw2nKEbQmdqRwkWiDg2WO5F05iqYcTVOOoXmOpSvH0erYkcIlog0OFjmed+UEmqc/XTmRppxEU06m1bEjNS4RZXDDIqfwt3IqTTmNppxO85xBV86k1diRGheIMjhcgvezHGfTPOfQlXNpynk05XxajR0pbYHcB4dLVN8v4KlcSFMuoikDaJ6L6coltAo7Utrw3AcnCwTPS3lXLqN5LqcrA2nKFTTlSlqFHUkNz3VwskDD8yr+Vq6mKYNonsF0ZQhNGUobakcqZLANT3ENn3mupSvX0ZRhNGU4zTPCjlTIYOaOEEbyuTKKplxP89xAV26kKaPtSIUMZu5o4SY+99xMV26hKbfSlNtokh3JFoo+mJm3O+6gKXfSlLtonrvpyj20VHYkWyb6YGbe6xhD89xHV+6nKQ/QlAdpqexIyTJRB1cXeoin8jBNeYSmPErzPEZXHqc1sSMli0QdXF3mCZ7KkzTPU3TlaZryDE15ltbEjhQuEm1wsMxzvCvP05QXaMqLNM9LdOVlWh07UrhEtMHBIq/w7hlLV16lKa/RlNdpnjfoNXakxgWiDA6X4P1Nx1s05W2a5x268i5NeY9WY0dqXCDK4HAJ3t9vwwd05UOa8hFN+Zjm+YReYUdKG5774GSB4Pkp78pnNOVzmucLuvIlTfmKVmFHShue++BkgeD5Ne+eb+jKtzTlO5ryPc0zjj7OjlTIYBue4gc+U36kKT/RPD/TlV9oynjaeDtSIYNteIpf+czzG135nab8QVP+pHkm2JEKGczcCcJffK78TVP+oXn+pSv/0ZRWO1Ihg5k70fyzI5X/2rhAeaQMP5HySOWRMlwgw1fKX1J5pAwXyPCV8pdUHinDBTJ8pfwllUfKcIEMXyl/SeWRMlwgw1f+B5sFAiUZ6xn1AAAAAElFTkSuQmCC">
	 * Image constant for icons/part-hover.png
	 */
	public static final String PART_HOVER = "icons/part-hover.png";
	
	/**
	 * <img src="data:image/gif;base64,R0lGODlhEAAQAPcAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACH5BAEAAP8ALAAAAAAQABAAAAgdAP8JHEiwoMGDCBMqXMiwocOHECNKnEixosWBAQEAOw==">
	 * Image constant for icons/transparent.gif
	 */
	public static final String TRANSPARENT = "icons/transparent.gif";
	private static final ImageRegistry REGISTRY = new ImageRegistry(Display.getDefault());
	
	public static Image getImage(String key){
		Image result = REGISTRY.get(key);
		if(result == null){
			result = loadImage(key);
			REGISTRY.put(key, result);
		}
		return result;
	}
	
	public static ImageDescriptor getImageDescriptor(String key){
		ImageDescriptor result = REGISTRY.getDescriptor(key);
		if(result == null){
			result = loadImageDescriptor(key);
			REGISTRY.put(key, result);
		}
		return result;
	}
	
	private static Image loadImage(String key) {
		try {
			URL resource = Platform.getBundle("net.jeeeyul.eclipse.themes").getResource(key);
			Image image = new Image(null, resource.openStream());
			return image;
		} catch (Exception e) {
			e.printStackTrace();
			return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJS_ERROR_TSK);
		}
	}
	
	private static ImageDescriptor loadImageDescriptor(String key) {
		try {
			URL resource = Platform.getBundle("net.jeeeyul.eclipse.themes").getResource(key);
			ImageDescriptor descriptor = ImageDescriptor.createFromURL(resource);
			return descriptor;
		} catch (Exception e) {
			e.printStackTrace();
			return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_OBJS_ERROR_TSK);
		}
	}
}
