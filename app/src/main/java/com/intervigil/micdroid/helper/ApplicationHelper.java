/* ApplicationHelper.java

   Copyright (c) 2010 Ethan Chen

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License along
   with this program; if not, write to the Free Software Foundation, Inc.,
   51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.intervigil.micdroid.helper;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public class ApplicationHelper {

    private ApplicationHelper() {}

    public static int getPackageVersion(Context context) {
        int versionCode = -1;
        try {
            versionCode = context.getPackageManager().getPackageInfo(
                    context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return versionCode;
    }
}